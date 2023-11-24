package edu.coding_bat.warmup_2.has_271;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has271Test {
    Has271 has271 = new Has271();

    @Test
    public void setHas271_1Test() {
        assertTrue(has271.has271(new int[]{1, 2, 7, 1}));
    }

    @Test
    public void setHas271_2Test() {
        assertFalse(has271.has271(new int[]{1, 2, 8, 1}));
    }

    @Test
    public void setHas271_3Test() {
        assertTrue(has271.has271(new int[]{2, 7, 1}));
    }

}