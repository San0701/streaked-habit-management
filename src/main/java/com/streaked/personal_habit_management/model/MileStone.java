package com.streaked.personal_habit_management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "milestone")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MileStone {
    private String streakLength;
    private String achievedDate;


}
