package edu.coding_bat.warmup_1.mix_start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStartTest {
    MixStart mixS = new MixStart();

    @Test
    public void mixStart1Test() {
        assertTrue(mixS.mixStart("mix snacks"));
    }

    @Test
    public void mixStart2Test() {
        assertTrue(mixS.mixStart("pix snacks"));
    }

    @Test
    public void mixStart3Test() {
        assertFalse(mixS.mixStart("piz snacks"));
    }

    @Test
    public void mixStart4Test() {
        assertTrue(mixS.mixStart("nix"));
    }

    @Test
    public void mixStart5Test() {
        assertFalse(mixS.mixStart("ni"));
    }

    @Test
    public void mixStart6Test() {
        assertFalse(mixS.mixStart("n"));
    }

    @Test
    public void mixStart7Test() {
        assertFalse(mixS.mixStart(""));
    }

}