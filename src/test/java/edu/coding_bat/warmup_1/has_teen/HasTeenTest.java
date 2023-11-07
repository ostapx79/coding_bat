package edu.coding_bat.warmup_1.has_teen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasTeenTest {
    HasTeen hasT = new HasTeen();

    @Test
    public void hasTeen1Test() {
        assertTrue(hasT.hasTeen(13, 20, 10));
    }

    @Test
    public void hasTeen2Test() {
        assertTrue(hasT.hasTeen(20, 19, 10));
    }

    @Test
    public void hasTeen3Test() {
        assertTrue(hasT.hasTeen(20, 10, 13));
    }

    @Test
    public void hasTeen4Test() {
        assertFalse(hasT.hasTeen(20, 9, 21));
    }

    @Test
    public void hasTeen5Test() {
        assertFalse(hasT.hasTeen(1, 20, 12));
    }

    @Test
    public void hasTeen6Test() {
        assertTrue(hasT.hasTeen(19, 20, 12));
    }

    @Test
    public void hasTeen7Test() {
        assertTrue(hasT.hasTeen(12, 20, 19));
    }

    @Test
    public void hasTeen8Test() {
        assertFalse(hasT.hasTeen(9, 20, 12));
    }

    @Test
    public void hasTeen9Test() {
        assertTrue(hasT.hasTeen(12, 18, 20));
    }

    @Test
    public void hasTeen10Test() {
        assertTrue(hasT.hasTeen(14, 2, 20));
    }

    @Test
    public void hasTeen11Test() {
        assertFalse(hasT.hasTeen(4, 2, 20));
    }

    @Test
    public void hasTeen12Test() {
        assertFalse(hasT.hasTeen(11, 22, 22));
    }
}