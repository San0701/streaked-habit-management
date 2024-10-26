package com.streaked.personal_habit_management.model.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "habit")
public class Habit {

    @Id
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

    public Habit(Integer id,Integer userId, String habitName, String frequency, List<String> reminders, String createdAt, String changedAt, Integer currentStreak, String longestStreak, List<Streak> streaks, List<MileStone> mileStones) {
        this.id = id;
        this.userId = userId;
        this.habitName = habitName;
        this.frequency = frequency;
        this.reminders = reminders;
        this.createdAt = createdAt;
        this.changedAt = changedAt;
        this.currentStreak = currentStreak;
        this.longestStreak = longestStreak;
        this.streaks = streaks;
        this.mileStones = mileStones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public List<String> getReminders() {
        return reminders;
    }

    public void setReminders(List<String> reminders) {
        this.reminders = reminders;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(String changedAt) {
        this.changedAt = changedAt;
    }

    public Integer getCurrentStreak() {
        return currentStreak;
    }

    public void setCurrentStreak(Integer currentStreak) {
        this.currentStreak = currentStreak;
    }

    public String getLongestStreak() {
        return longestStreak;
    }

    public void setLongestStreak(String longestStreak) {
        this.longestStreak = longestStreak;
    }

    public List<Streak> getStreaks() {
        return streaks;
    }

    public void setStreaks(List<Streak> streaks) {
        this.streaks = streaks;
    }

    public List<MileStone> getMileStones() {
        return mileStones;
    }

    public void setMileStones(List<MileStone> mileStones) {
        this.mileStones = mileStones;
    }
}