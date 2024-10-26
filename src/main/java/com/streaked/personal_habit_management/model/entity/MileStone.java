package com.streaked.personal_habit_management.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "milestone")
public class MileStone {

    private String streakLength;
    private String achievedDate;

    public MileStone(String streakLength, String achievedDate) {
        this.streakLength = streakLength;
        this.achievedDate = achievedDate;
    }

    public String getStreakLength() {
        return streakLength;
    }

    public void setStreakLength(String streakLength) {
        this.streakLength = streakLength;
    }

    public String getAchievedDate() {
        return achievedDate;
    }

    public void setAchievedDate(String achievedDate) {
        this.achievedDate = achievedDate;
    }
}
