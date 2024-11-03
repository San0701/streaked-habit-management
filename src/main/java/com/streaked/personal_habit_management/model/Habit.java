package com.streaked.personal_habit_management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "habits")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Habit {
    private Integer id;
    private Integer userId;

    private String habitName;

    private String frequency;

    private List<String> reminders;

    private String createdAt;

    private String changedAt;

    private Integer currentStreak;

    private String longestStreak;

    private List<Streak> streaks;

    private List<MileStone> mileStones;
}
