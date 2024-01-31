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

}