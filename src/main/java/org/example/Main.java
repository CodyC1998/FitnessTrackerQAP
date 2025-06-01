package org.example;

import org.example.model.Workout;
import org.example.model.Goal;
import org.example.service.FitnessTracker;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();

        // Add sample workouts
        tracker.addWorkout(new Workout("Running", 30, LocalDate.now()));
        tracker.addWorkout(new Workout("Cycling", 45, LocalDate.now().minusDays(1)));
        tracker.addWorkout(new Workout("Swimming", 60, LocalDate.now().minusDays(7)));

        // Print all workouts
        System.out.println("All Workouts:");
        List<Workout> workouts = tracker.getWorkouts();
        for (Workout w : workouts) {
            System.out.println(w);
        }

        // Show total workout time
        System.out.println("\nTotal Workout Time: " + tracker.getTotalWorkoutTime() + " minutes");

        // Set a goal and check progress
        Goal goal = new Goal("Workout 3 times this week", 3);
        System.out.println("Goal: " + goal.getDescription());
        System.out.println("Workouts this week: " + tracker.getWorkoutsThisWeek());
        System.out.println("Is goal met? " + tracker.isGoalMet(goal));
    }
}
