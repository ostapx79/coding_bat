package edu.coding_bat.logic_1.alarm_clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmClockTest {
    AlarmClock alarmClock = new AlarmClock();

    @Test
    public void setAlarmClock1Test() {
        assertEquals(alarmClock.alarmClock(1, false), "7:00");
    }

    @Test
    public void setAlarmClock2Test() {
        assertEquals(alarmClock.alarmClock(5, false), "7:00");
    }

    @Test
    public void setAlarmClock3Test() {
        assertEquals(alarmClock.alarmClock(0, false), "10:00");
    }

    @Test
    public void setAlarmClock4Test() {
        assertEquals(alarmClock.alarmClock(6, false), "10:00");
    }

    @Test
    public void setAlarmClock5Test() {
        assertEquals(alarmClock.alarmClock(0, true), "off");
    }

    @Test
    public void setAlarmClock6Test() {
        assertEquals(alarmClock.alarmClock(6, true), "off");
    }

    @Test
    public void setAlarmClock7Test() {
        assertEquals(alarmClock.alarmClock(1, true), "10:00");
    }

    @Test
    public void setAlarmClock8Test() {
        assertEquals(alarmClock.alarmClock(3, true), "10:00");
    }

    @Test
    public void setAlarmClock9Test() {
        assertEquals(alarmClock.alarmClock(5, true), "10:00");
    }
}