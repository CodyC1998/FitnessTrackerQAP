package org.example.model;

import java.time.LocalDate;

public class Workout {
    private String name;
    private int duration;
    private LocalDate date;

    public Workout(String name, int duration, LocalDate date) {
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

//    getters
    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Workout [name: " + name + ", duration: " + duration + ", date: " + date + "]";
    }
}
