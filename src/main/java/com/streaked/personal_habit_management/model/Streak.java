package com.streaked.personal_habit_management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "streak")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Streak {
    private String date;
    private String status;
}
