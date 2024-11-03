package com.streaked.personal_habit_management.service;


import com.streaked.personal_habit_management.model.Habit;
import com.streaked.personal_habit_management.repository.HMRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HMService {

    @Autowired
    private HMRepository repository;

    public Habit create(Habit dto) {
        return repository.save(dto);
    }

    public Habit find(Integer id) {
        return repository.findById(id).get();
    }

    public List<Habit> findAll() {

        return repository.findAll();
    }

    public Habit update(Integer id, Habit source) {

        Habit target = repository.findById(id).get();
        BeanUtils.copyProperties(source, target);

        return repository.save(target);
    }

    public String delete(Integer id) {
        repository.deleteById(id);
        return "Successfully deleted";
    }

    public List<Habit> findUsersByLongestStreakBetween(Integer low, Integer high)
    {
        return repository.findUsersByLongestStreakBetween(low,high);
    }
}
