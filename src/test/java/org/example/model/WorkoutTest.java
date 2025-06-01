package org.example.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class WorkoutTest {
    @Test
    void testWorkoutConstructorAndGetters() {
        Workout workout = new Workout("Yoga", 60, LocalDate.of(2025, 6, 1));

        assertEquals("Yoga", workout.getName(), "Workout name should be 'Yoga'");
        assertEquals(60, workout.getDuration(), "Workout duration should be 60 minutes");
        assertEquals(LocalDate.of(2025, 6, 1), workout.getDate(), "Workout date should be 2025-06-01");
    }

    @Test
    void testWorkoutToStringContainsAllFields() {
        Workout workout = new Workout("Pilates", 45, LocalDate.of(2025, 6, 2));
        String output = workout.toString();

        assertTrue(output.contains("Pilates"), "toString should contain the workout name");
        assertTrue(output.contains("45"), "toString should contain the workout duration");
        assertTrue(output.contains("2025-06-02"), "toString should contain the date");
    }


}
