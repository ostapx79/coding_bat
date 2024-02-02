package edu.coding_bat.logic_1.max_mod5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMod5Test {
    MaxMod5 maxMod5 = new MaxMod5();

    @Test
    public void setMaxMod5_1Test() {
        assertEquals(maxMod5.maxMod5(2, 3), 3);
    }

    @Test
    public void setMaxMod5_2Test() {
        assertEquals(maxMod5.maxMod5(6, 2), 6);
    }

    @Test
    public void setMaxMod5_3Test() {
        assertEquals(maxMod5.maxMod5(3, 2), 3);
    }

<<<<<<< HEAD
    @Test
    public void setMaxMod5_4Test() {
        assertEquals(maxMod5.maxMod5(8, 12), 12);
    }

    @Test
    public void setMaxMod5_5Test() {
        assertEquals(maxMod5.maxMod5(7, 12), 7);
    }

    @Test
    public void setMaxMod5_6Test() {
        assertEquals(maxMod5.maxMod5(11, 6), 6);
    }

    @Test
    public void setMaxMod5_7Test() {
        assertEquals(maxMod5.maxMod5(2, 7), 2);
    }

    @Test
    public void setMaxMod5_8Test() {
        assertEquals(maxMod5.maxMod5(7, 7), 0);
    }

    @Test
    public void setMaxMod5_9Test() {
        assertEquals(maxMod5.maxMod5(9, 1), 9);
    }

    @Test
    public void setMaxMod5_10Test() {
        assertEquals(maxMod5.maxMod5(9, 14), 9);
    }

    @Test
    public void setMaxMod5_Test() {
        assertEquals(maxMod5.maxMod5(1, 2), 2);
    }
=======
>>>>>>> origin/main
}