package com.streaked.personal_habit_management.mapper;

import com.streaked.personal_habit_management.model.dto.MileStoneDto;
import com.streaked.personal_habit_management.model.entity.MileStone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")

public interface MileStoneMapper {
    MileStoneMapper INSTANCE = Mappers.getMapper(MileStoneMapper.class);

    MileStoneDto toDto(MileStone entity);

    MileStone toEntity(MileStoneDto dto);
}
