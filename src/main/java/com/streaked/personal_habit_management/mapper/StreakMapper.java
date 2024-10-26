package com.streaked.personal_habit_management.mapper;

import com.streaked.personal_habit_management.model.dto.StreakDto;
import com.streaked.personal_habit_management.model.entity.Streak;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StreakMapper {
    StreakMapper INSTANCE = Mappers.getMapper(StreakMapper.class);

    StreakDto toDto(Streak entity);

    StreakDto toEntity(Streak dto);
}
