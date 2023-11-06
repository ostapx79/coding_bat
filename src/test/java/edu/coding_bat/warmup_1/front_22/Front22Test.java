package edu.coding_bat.warmup_1.front_22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front22Test {
    Front22 front22T = new Front22();

    @Test
    public void front22_1Test() {
        assertEquals(front22T.front22("kitten"), "kikittenki");
    }

    @Test
    public void front22_2Test() {
        assertEquals(front22T.front22("Ha"), "HaHaHa");
    }

    @Test
    public void front22_3Test() {
        assertEquals(front22T.front22("abc"), "ababcab");
    }

    @Test
    public void front22_4Test() {
        assertEquals(front22T.front22("ab"), "ababab");
    }

    @Test
    public void front22_5Test() {
        assertEquals(front22T.front22(""), "");
    }

    @Test
    public void front22_6Test() {
        assertEquals(front22T.front22("a"), "aaa");
    }

    @Test
    public void front22_7Test() {
        assertEquals(front22T.front22("Logic"), "LoLogicLo");
    }

    @Test
    public void front22_8Test() {
        assertEquals(front22T.front22_2(""), "");
    }

    @Test
    public void front22_9Test() {
        assertEquals(front22T.front22_2("a"), "aaa");
    }

    @Test
    public void front22_10Test() {
        assertEquals(front22T.front22_2("Logic"), "LoLogicLo");
    }
}