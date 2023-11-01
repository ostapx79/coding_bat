package edu.coding_bat.warmup_1.sleep_in;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {
    @Test
    public void sleepInFalseFalseTest() {
        boolean weekday = false;
        boolean vacation = false;
        boolean sleepIn = SleepIn.sleepIn(weekday, vacation);

        assertTrue(sleepIn);
    }

    @Test
    public void sleepInTrueFalseTest() {
        boolean weekday = true;
        boolean vacation = false;

        assertFalse(SleepIn.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInFalseTrueTest() {
        boolean weekday = false;
        boolean vacation = true;

        assertTrue(SleepIn.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInTrueTrueTest() {
        boolean weekday = true;
        boolean vacation = true;

        assertTrue(SleepIn.sleepIn(weekday, vacation));
    }

}