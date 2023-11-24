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

    @Test
    public void setHas271_4Test() {
        assertTrue(has271.has271(new int[]{3, 8, 2}));
    }

    @Test
    public void setHas271_5Test() {
        assertTrue(has271.has271(new int[]{2, 7, 3}));
    }

    @Test
    public void setHas271_6Test() {
        assertFalse(has271.has271(new int[]{2, 7, 4}));
    }

    @Test
    public void setHas271_7Test() {
        assertTrue(has271.has271(new int[]{2, 7, -1}));
    }

    @Test
    public void setHas271_8Test() {
        assertFalse(has271.has271(new int[]{2, 7, -2}));
    }

    @Test
    public void setHas271_9Test() {
        assertTrue(has271.has271(new int[]{4, 5, 3, 8, 0}));
    }

    @Test
    public void setHas271_10Test() {
        assertTrue(has271.has271(new int[]{2, 7, 5, 10, 4}));
    }

    @Test
    public void setHas271_11Test() {
        assertTrue(has271.has271(new int[]{2, 7, -2, 4, 9, 3}));
    }

    @Test
    public void setHas271_12Test() {
        assertFalse(has271.has271(new int[]{2, 7, 5, 10, 1}));
    }

    @Test
    public void setHas271_13Test() {
        assertFalse(has271.has271(new int[]{1, 1, 4, 9, 0}));
    }

    @Test
    public void setHas271_14Test() {
        assertTrue(has271.has271(new int[]{1, 1,4, 9, 4, 9, 2}));
    }

}