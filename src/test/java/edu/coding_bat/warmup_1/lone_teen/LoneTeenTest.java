package edu.coding_bat.warmup_1.lone_teen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoneTeenTest {
    LoneTeen loneT = new LoneTeen();

    @Test
    public void loneTeen1Test() {
        assertTrue(loneT.loneTeen(13, 99));
    }

    @Test
    public void loneTeen2Test() {
        assertTrue(loneT.loneTeen(21, 19));
    }

    @Test
    public void loneTeen3Test() {
        assertFalse(loneT.loneTeen(13, 13));
    }

    @Test
    public void loneTeen4Test() {
        assertFalse(loneT.loneTeen(16, 17));
    }

    @Test
    public void loneTeen5Test() {
        assertTrue(loneT.loneTeen(16, 9));
    }

    @Test
    public void loneTeen6Test() {
        assertFalse(loneT.loneTeen(16, 18));
    }

    @Test
    public void loneTeen7Test() {
        assertFalse(loneT.loneTeen(13, 19));
    }

    @Test
    public void loneTeen8Test() {
        assertTrue(loneT.loneTeen(13, 20));
    }

    @Test
    public void loneTeen9Test() {
        assertTrue(loneT.loneTeen(6, 18));
    }

    @Test
    public void loneTeen10Test() {
        assertTrue(loneT.loneTeen(99, 13));
    }

    @Test
    public void loneTeen11Test() {
        assertFalse(loneT.loneTeen(99, 99));
    }
}