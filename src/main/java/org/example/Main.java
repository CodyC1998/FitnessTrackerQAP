package org.example;

import org.example.model.Workout;
import org.example.service.FitnessTracker;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();

        // Add a few workouts
        tracker.addWorkout(new Workout("Running", 30, LocalDate.of(2025, 5, 25)));
        tracker.addWorkout(new Workout("Cycling", 45, LocalDate.of(2025, 5, 26)));

        // Get all workouts and print them
        List<Workout> allWorkouts = tracker.getWorkouts();
        for (Workout workout : allWorkouts) {
            System.out.println(workout);
        }

    }
}