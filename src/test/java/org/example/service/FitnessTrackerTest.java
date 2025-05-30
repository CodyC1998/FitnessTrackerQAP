package org.example.service;
import org.junit.jupiter.api.Test;
import org.example.model.Workout;
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
}
