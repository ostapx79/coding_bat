package edu.coding_bat.logic_1.caught_speeding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaughtSpeedingTest {
    CaughtSpeeding caughtSpeeding  = new CaughtSpeeding();

    @Test
    public void setCaughtSpeeding1Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(60, false), 0);
    }

    @Test
    public void setCaughtSpeeding2Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(65, false), 1);
    }

    @Test
    public void setCaughtSpeeding3Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(65, true), 0);
    }

    @Test
    public void setCaughtSpeeding4Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(80, false), 1);
    }

    @Test
    public void setCaughtSpeeding5Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(85, false), 2);
    }

    @Test
    public void setCaughtSpeeding6Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(85, true), 1);
    }

    @Test
    public void setCaughtSpeeding7Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(70, false), 1);
    }

    @Test
    public void setCaughtSpeeding8Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(75, false), 1);
    }

    @Test
    public void setCaughtSpeeding9Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(75, true), 1);
    }

    @Test
    public void setCaughtSpeeding10Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(40, false), 0);
    }

    @Test
    public void setCaughtSpeeding11Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(40, true), 0);
    }

    @Test
    public void setCaughtSpeeding12Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(90, false), 2);
    }

    @Test
    public void setCaughtSpeeding13Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(95, true), 2);
    }

    @Test
    public void setCaughtSpeeding14Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(95, false), 2);
    }

    @Test
    public void setCaughtSpeeding15Test() {
        assertEquals(caughtSpeeding.caughtSpeeding(105, true), 2);
    }

}