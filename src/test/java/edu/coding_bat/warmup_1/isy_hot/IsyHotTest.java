package edu.coding_bat.warmup_1.isy_hot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsyHotTest {
    IsyHot isyH = new IsyHot();

    @Test
    public void isyHot1Test() {
        assertTrue(isyH.isyHot(120, -1));
    }

    @Test
    public void isyHot2Test() {
        assertTrue(isyH.isyHot(-1, 120));
    }

    @Test
    public void isyHot3Test() {
        assertFalse(isyH.isyHot(2, 120));
    }

    @Test
    public void isyHot4Test() {
        assertFalse(isyH.isyHot(-1, 100));
    }

    @Test
    public void isyHot5Test() {
        assertFalse(isyH.isyHot(120, 120));
    }

    @Test
    public void isyHot6Test() {
        assertFalse(isyH.isyHot(-2, -2));
    }
}