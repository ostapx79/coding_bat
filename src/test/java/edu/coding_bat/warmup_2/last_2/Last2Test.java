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

    @Test
    public void last2_16Test() {
        assertEquals(last2.last2T("hixxhi"), 1);
    }

    @Test
    public void last2_17Test() {
        assertEquals(last2.last2T("xaxxaxaxx"), 1);
    }

    @Test
    public void last2_18Test() {
        assertEquals(last2.last2T("axxxaaxx"), 2);
    }

    @Test
    public void last2_19Test() {
        assertEquals(last2.last2T("xxxx"), 2);
    }

    @Test
    public void last2_20Test() {
        assertEquals(last2.last2T("13121312"), 1);
    }

    @Test
    public void last2_21Test() {
        assertEquals(last2.last2T("11212"), 1);
    }

    @Test
    public void last2_22Test() {
        assertEquals(last2.last2T("13121311"), 0);
    }

    @Test
    public void last2_23Test() {
        assertEquals(last2.last2T("1717171"), 2);
    }

    @Test
    public void last2_24Test() {
        assertEquals(last2.last2T("hi"), 0);
    }

    @Test
    public void last2_25Test() {
        assertEquals(last2.last2T("h"), 0);
    }

    @Test
    public void last2_26Test() {
        assertEquals(last2.last2T(""), 0);
    }

    @Test
    public void last2_27Test() {
        assertEquals(last2.last2T("hh"), 0);
    }

    @Test
    public void last2_28Test() {
        assertEquals(last2.last2T("xxaxxaxxaxx"), 3);
    }

    @Test
    public void last2_29Test() {
        assertEquals(last2.last2T("xaxaxaxx"), 0);
    }
}