package edu.coding_bat.string_1.has_bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasBadTest {
    HasBad hasBad = new HasBad();

    @Test
    public void setHasBad1Test() {
        assertTrue(hasBad.hasBad("badxx"));
        assertTrue(hasBad.hasBad2("badxx"));
    }

    @Test
    public void setHasBad2Test() {
        assertTrue(hasBad.hasBad("xbadxx"));
        assertTrue(hasBad.hasBad2("xbadxx"));
    }

    @Test
    public void setHasBad3Test() {
        assertFalse(hasBad.hasBad("xxbadxx"));
        assertFalse(hasBad.hasBad2("xxbadxx"));
    }

    @Test
    public void setHasBad4Test() {
        assertFalse(hasBad.hasBad("code"));
        assertFalse(hasBad.hasBad2("code"));
    }

    @Test
    public void setHasBad5Test() {
        assertTrue(hasBad.hasBad("bad"));
        assertTrue(hasBad.hasBad2("bad"));
    }

    @Test
    public void setHasBad6Test() {
        assertFalse(hasBad.hasBad("ba"));
        assertFalse(hasBad.hasBad2("ba"));
    }

    @Test
    public void setHasBad7Test() {
        assertFalse(hasBad.hasBad("xba"));
        assertFalse(hasBad.hasBad2("xba"));
    }

    @Test
    public void setHasBad8Test() {
        assertTrue(hasBad.hasBad("xbad"));
        assertTrue(hasBad.hasBad2("xbad"));
    }

    @Test
    public void setHasBad9Test() {
        assertFalse(hasBad.hasBad(""));
        assertFalse(hasBad.hasBad2(""));
    }

    @Test
    public void setHasBad10Test() {
        assertTrue(hasBad.hasBad("badyy"));
        assertTrue(hasBad.hasBad2("badyy"));
    }

}