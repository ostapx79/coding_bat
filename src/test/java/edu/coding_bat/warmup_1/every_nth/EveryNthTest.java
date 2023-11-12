package edu.coding_bat.warmup_1.every_nth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EveryNthTest {
    EveryNth everyN = new EveryNth();

    @Test
    public void everyNth1Test() {
        assertEquals(everyN.everyNth("Miracle", 2), "Mrce");
    }

    @Test
    public void everyNth2Test() {
        assertEquals(everyN.everyNth("abcdefg", 2), "aceg");
    }

    @Test
    public void everyNth3Test() {
        assertEquals(everyN.everyNth("abcdefg", 3), "adg");
    }

    @Test
    public void everyNth4Test() {
        assertEquals(everyN.everyNth("Chocolate", 3), "Cca");
    }

    @Test
    public void everyNth5Test() {
        assertEquals(everyN.everyNth("Chocolates", 3), "Ccas");
    }

    @Test
    public void everyNth6Test() {
        assertEquals(everyN.everyNth("Chocolates", 4), "Coe");
    }

    @Test
    public void everyNth7Test() {
        assertEquals(everyN.everyNth("Chocolates", 100), "C");
    }
}