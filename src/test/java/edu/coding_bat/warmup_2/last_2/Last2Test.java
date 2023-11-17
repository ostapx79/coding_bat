package edu.coding_bat.warmup_2.last_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Last2Test {
    Last2 last2 = new Last2();

    @Test
    public void last2_1Test() {
        assertEquals(last2.last2("hixxhi"), 1);
    }

    @Test
    public void last2_2Test() {
        assertEquals(last2.last2("xaxxaxaxx"), 1);
    }

    @Test
    public void last2_3Test() {
        assertEquals(last2.last2("axxxaaxx"), 2);
    }

    @Test
    public void last2_4Test() {
        assertEquals(last2.last2("xxxx"), 2);
    }

    @Test
    public void last2_5Test() {
        assertEquals(last2.last2("13121312"), 0);
    }

    @Test
    public void last2_6Test() {
        assertEquals(last2.last2("11212"), 0);
    }

    @Test
    public void last2_7Test() {
        assertEquals(last2.last2("13121311"), 1);
    }

    @Test
    public void last2_8Test() {
        assertEquals(last2.last2("1717171"), 0);
    }

    @Test
    public void last2_9Test() {
        assertEquals(last2.last2("hi"), 0);
    }

    @Test
    public void last2_10Test() {
        assertEquals(last2.last2("h"), 0);
    }

    @Test
    public void last2_11Test() {
        assertEquals(last2.last2(""), 0);
    }

    @Test
    public void last2_13Test() {
        assertEquals(last2.last2("hh"), 1);
    }

    @Test
    public void last2_14Test() {
        assertEquals(last2.last2("xxaxxaxxaxx"), 1);
    }

    @Test
    public void last2_15Test() {
        assertEquals(last2.last2("xaxaxaxx"), 1);
    }

    @Test
    public void resRev1Test() {
        assertEquals(last2.resRev("hixxhi"), "ihxxih");
    }

    @Test
    public void resRev2Test() {
        assertEquals(last2.resRev("xaxxaxaxx"), "xxaxaxxax");
    }

    @Test
    public void resRev3Test() {
        assertEquals(last2.resRev("axxxaaxx"), "xxaaxxxa");
    }

}