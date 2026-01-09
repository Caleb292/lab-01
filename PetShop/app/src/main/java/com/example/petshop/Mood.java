package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date moodDate;

    // Constructor - sets date to default
    public Mood() {
        this.moodDate = new Date();
    }

    // Constructor - takes date as an argument
    public Mood(Date date) {
        this.moodDate = date;
    }

    // Getter and Setter to access date date
    public Date getDate() {
        return moodDate;
    }

    public void setDate(Date date) {
        this.moodDate = date;
    }

    public abstract String getMood();
}
