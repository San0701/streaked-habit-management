package com.streaked.personal_habit_management.model.dto;


public class MileStoneDto {
    private String streakLength;
    private String achievedDate;

    public MileStoneDto(String streakLength, String achievedDate) {
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
