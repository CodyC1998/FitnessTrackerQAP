package org.example.service;

import java.util.List;
import java.util.ArrayList;
import org.example.model.Workout;

public class FitnessTracker {
    private final List<Workout> workouts;

    public FitnessTracker() {
        workouts = new ArrayList<>();
    }

    public void addWorkout(Workout workout) {
        if (workout == null) {
            System.out.println("Cannot add null workout.");
            return;
        }
        workouts.add(workout);
    }

    public List<Workout> getWorkouts() {
        return new ArrayList<>(workouts);
    }

}
