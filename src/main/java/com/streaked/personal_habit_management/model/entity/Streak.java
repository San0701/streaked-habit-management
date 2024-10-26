package com.streaked.personal_habit_management.model.entity;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "streak")
public class Streak {
    private String date;
    private String status;

    public Streak(String date, String status) {
        this.date = date;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
