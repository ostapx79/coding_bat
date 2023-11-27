package edu.coding_bat.string_1.non_start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonStartTest {
    NonStart nonStart = new NonStart();

    @Test
    public void setNonStart1Test() {
        assertEquals(nonStart.nonStart("Hello", "There"), "ellohere");
    }

    @Test
    public void setNonStart2Test() {
        assertEquals(nonStart.nonStart("java", "code"), "avaode");
    }

    @Test
    public void setNonStart3Test() {
        assertEquals(nonStart.nonStart("shotl", "java"), "hotlava");
    }

    @Test
    public void setNonStart4Test() {
        assertEquals(nonStart.nonStart("ab", "xy"), "by");
    }

    @Test
    public void setNonStart5Test() {
        assertEquals(nonStart.nonStart("ab", "x"), "b");
    }

    @Test
    public void setNonStart6Test() {
        assertEquals(nonStart.nonStart("x", "ac"), "c");
    }

    @Test
    public void setNonStart7Test() {
        assertEquals(nonStart.nonStart("a", "x"), "");
    }

    @Test
    public void setNonStart8Test() {
        assertEquals(nonStart.nonStart("kit", "kat"), "itat");
    }

    @Test
    public void setNonStart9Test() {
        assertEquals(nonStart.nonStart("mart", "dart"), "artart");
    }
}