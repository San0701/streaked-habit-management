package com.streaked.personal_habit_management.service;


import com.streaked.personal_habit_management.mapper.HabitMapper;
import com.streaked.personal_habit_management.model.dto.HabitDto;
import com.streaked.personal_habit_management.model.entity.Habit;
import com.streaked.personal_habit_management.repository.HMRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HMService {

    @Autowired
    HabitMapper mapper;
    @Autowired
    private HMRepository repository;

    public HabitDto create(HabitDto dto) {
        Habit entity = mapper.toEntity(dto);

        Habit savedEntity = repository.save(entity);

        return mapper.toDto(savedEntity);
    }

    public HabitDto find(Integer id) {
        Habit found = repository.findById(id).get();

        return mapper.toDto(found);
    }

    public List<HabitDto> findAll() {
        List<Habit> allHabits = repository.findAll();
        return allHabits.stream().map(mapper::toDto).collect(Collectors.toList());
    }

    public HabitDto update(Integer id, HabitDto dto) {
        Habit sourceEntity = mapper.toEntity(dto);
        Habit targetEntity = repository.findById(id).get();
        BeanUtils.copyProperties(sourceEntity, targetEntity);
        Habit updatedEntity = repository.save(targetEntity);

        return mapper.toDto(updatedEntity);
    }

    public String delete(Integer id) {
        repository.deleteById(id);
        return "Successfully deleted";
    }
}
