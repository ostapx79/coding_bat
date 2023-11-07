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
}