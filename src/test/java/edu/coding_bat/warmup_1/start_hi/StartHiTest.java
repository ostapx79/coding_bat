package edu.coding_bat.warmup_1.start_hi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartHiTest {
    StartHi startH = new StartHi();

    @Test
    public void startHi1Test() {
        assertTrue(startH.startHi("hi there"));
    }

    @Test
    public void startHi2Test() {
        assertTrue(startH.startHi("hi"));
    }

    @Test
    public void startHi3Test() {
        assertFalse(startH.startHi("hello hi"));
    }

    @Test
    public void startHi4Test() {
        assertFalse(startH.startHi("he"));
    }

    @Test
    public void startHi5Test() {
        assertFalse(startH.startHi2("h"));
    }

    @Test
    public void startHi6Test() {
        assertFalse(startH.startHi(""));
    }

    @Test
    public void startHi7Test() {
        assertFalse(startH.startHi("ho hi"));
    }

    @Test
    public void startHi8Test() {
        assertTrue(startH.startHi("hi ho"));
    }

    @Test
    public void startHi9Test() {
        assertTrue(startH.startHi2("hi there"));
    }

    @Test
    public void startHi10Test() {
        assertTrue(startH.startHi2("hi"));
    }

    @Test
    public void startHi11Test() {
        assertFalse(startH.startHi2("hello hi"));
    }

    @Test
    public void startHi12Test() {
        assertFalse(startH.startHi2("he"));
    }

    @Test
    public void startHi13Test() {
        assertFalse(startH.startHi2("h"));
    }

    @Test
    public void startHi14Test() {
        assertFalse(startH.startHi2(""));
    }

    @Test
    public void startHi15Test() {
        assertFalse(startH.startHi2("ho hi"));
    }

    @Test
    public void startHi16Test() {
        assertTrue(startH.startHi2("hi ho"));
    }

}