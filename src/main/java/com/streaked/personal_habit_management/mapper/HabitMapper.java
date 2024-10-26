package com.streaked.personal_habit_management.mapper;


import com.streaked.personal_habit_management.model.dto.HabitDto;
import com.streaked.personal_habit_management.model.entity.Habit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface HabitMapper {

    HabitMapper INSTANCE = Mappers.getMapper(HabitMapper.class);

    HabitDto toDto(Habit entity);

    Habit toEntity(HabitDto dto);

}
