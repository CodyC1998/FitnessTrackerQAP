package org.example.service;
import org.junit.jupiter.api.Test;
import org.example.model.Workout;
import org.example.model.Goal;
import org.example.service.FitnessTracker;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class FitnessTrackerTest {

    @Test
    void testAddValidWorkoutIncreasesListSize() {
        FitnessTracker tracker = new FitnessTracker();
        Workout workout = new Workout("Running", 30, LocalDate.now());

        tracker.addWorkout(workout);
        assertEquals(1, tracker.getWorkouts().size(), "Workout list size should be 1 after adding one workout.");
    }

    @Test
    void testAddNullWorkoutDoesNotChangeListSize() {
        FitnessTracker tracker = new FitnessTracker();

        tracker.addWorkout(null);
        assertEquals(0, tracker.getWorkouts().size(), "Workout list size should still be 0 after trying to add null.");
    }

    @Test
    void testTotalWorkoutTime() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.addWorkout(new Workout("Run", 30, LocalDate.now()));
        tracker.addWorkout(new Workout("Swim", 40, LocalDate.now()));

        assertEquals(70, tracker.getTotalWorkoutTime(), "Total workout time should be 70 minutes");
    }

    @Test
    void testGoalMet() {
        FitnessTracker tracker = new FitnessTracker();
        tracker.addWorkout(new Workout("Run", 30, LocalDate.now()));
        tracker.addWorkout(new Workout("Swim", 40, LocalDate.now()));
        tracker.addWorkout(new Workout("Bike", 60, LocalDate.now()));

        Goal goal = new Goal("Workout 3 times a week", 3);
        assertTrue(tracker.isGoalMet(goal), "Goal should be met with 3 workouts");
    }
}
