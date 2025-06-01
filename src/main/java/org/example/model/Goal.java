package org.example.model;

public class Goal {
    private final String description;
    private final int targetWorkoutsPerWeek;

    public Goal(String description, int targetWorkoutsPerWeek) {
        this.description = description;
        this.targetWorkoutsPerWeek = targetWorkoutsPerWeek;
    }

    public String getDescription() {
        return description;
    }

    public int getTargetWorkoutsPerWeek() {
        return targetWorkoutsPerWeek;
    }
}
