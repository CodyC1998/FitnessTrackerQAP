package org.example.service;

import java.util.List;
import java.util.ArrayList;
import org.example.model.Workout;
import org.example.model.Goal;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

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

    public int getWorkoutsThisWeek() {
        LocalDate now = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int currentWeek = now.get(weekFields.weekOfWeekBasedYear());
        int currentYear = now.getYear();

        int count = 0;
        for (Workout workout : workouts) {
            int workoutWeek = workout.getDate().get(weekFields.weekOfWeekBasedYear());
            int workoutYear = workout.getDate().getYear();
            if (workoutWeek == currentWeek && workoutYear == currentYear) {
                count++;
            }
        }
        return count;
    }

    public boolean isGoalMet(Goal goal) {
        return getWorkoutsThisWeek() >= goal.getTargetWorkoutsPerWeek();
    }

    public int getTotalWorkoutTime() {
        int total = 0;
        for (Workout workout : workouts) {
            total += workout.getDuration();
        }
        return total;
    }


}
