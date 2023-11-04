package edu.coding_bat.warmup_1.pos_neg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosNegTest {
    PosNeg postN = new PosNeg();
    @Test
    public void postNeg1Test() {
        assertTrue(postN.postNeg(1, -1, false));
    }

    @Test
    public void postNeg2Test() {
        assertTrue(postN.postNeg(-1, 1, false));
    }

    @Test
    public void postNeg3Test() {
        assertTrue(postN.postNeg(-4, -5, true));
    }

    @Test
    public void postNeg4Test() {
        assertFalse(postN.postNeg(-4, -5, false));
    }

    @Test
    public void postNeg5Test() {
        assertTrue(postN.postNeg(-4, 5, false));
    }

    @Test
    public void postNeg6Test() {
        assertFalse(postN.postNeg(-4, 5, true));
    }

    @Test
    public void postNeg7Test() {
        assertFalse(postN.postNeg(1, 1, false));
    }

    @Test
    public void postNeg8Test() {
        assertFalse(postN.postNeg(-1, -1, false));
    }

    @Test
    public void postNeg9Test() {
        assertFalse(postN.postNeg(1, -1, true));
    }

    @Test
    public void postNeg10Test() {
        assertFalse(postN.postNeg(-1, 1, true));
    }

    @Test
    public void postNeg11Test() {
        assertFalse(postN.postNeg(1, 1, true));
    }

    @Test
    public void postNeg12Test() {
        assertTrue(postN.postNeg(-1, -1, true));
    }

    @Test
    public void postNeg13Test() {
        assertTrue(postN.postNeg(5, -5, false));
    }

    @Test
    public void postNeg14Test() {
        assertTrue(postN.postNeg(-6, 6, false));
    }

    @Test
    public void postNeg15Test() {
        assertTrue(postN.postNeg(-5, -5, true));
    }

    @Test
    public void postNeg16Test() {
        assertFalse(postN.postNeg(-5, -6, false));
    }

    @Test
    public void postNeg17Test() {
        assertFalse(postN.postNeg(-2, -1, false));
    }

    @Test
    public void postNeg18Test() {
        assertFalse(postN.postNeg(1, 2, false));
    }

    @Test
    public void postNeg19Test() {
        assertFalse(postN.postNeg(-6, 5, true));
    }

}