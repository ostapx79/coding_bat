package edu.coding_bat.logic_1.more20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class More20Test {
    More20 more20 = new More20();

    @Test
    public void setMore20_1Test() {
        assertFalse(more20.more20(20));
    }

    @Test
    public void setMore20_2Test() {
        assertTrue(more20.more20(21));
    }

    @Test
    public void setMore20_3Test() {
        assertTrue(more20.more20(22));
    }

    @Test
    public void setMore20_4Test() {
        assertFalse(more20.more20(23));
    }

    @Test
    public void setMore20_5Test() {
        assertFalse(more20.more20(25));
    }

    @Test
    public void setMore20_6Test() {
        assertFalse(more20.more20(30));
    }

    @Test
    public void setMore20_7Test() {
        assertFalse(more20.more20(31));
    }

    @Test
    public void setMore20_8Test() {
        assertFalse(more20.more20(59));
    }

    @Test
    public void setMore20_9Test() {
        assertFalse(more20.more20(60));
    }

    @Test
    public void setMore20_10Test() {
        assertTrue(more20.more20(61));
    }

    @Test
    public void setMore20_11Test() {
        assertTrue(more20.more20(62));
    }

    @Test
    public void setMore20_12Test() {
        assertFalse(more20.more20(1020));
    }

    @Test
    public void setMore20_13Test() {
        assertTrue(more20.more20(1021));
    }

    @Test
    public void setMore20_14Test() {
        assertFalse(more20.more20(1000));
    }

    @Test
    public void setMore20_15Test() {
        assertTrue(more20.more20(1001));
    }

    @Test
    public void setMore20_16Test() {
        assertFalse(more20.more20(50));
    }

    @Test
    public void setMore20_17Test() {
        assertFalse(more20.more20(55));
    }

    @Test
    public void setMore20_18Test() {
        assertFalse(more20.more20(40));
    }

    @Test
    public void setMore20_19Test() {
        assertTrue(more20.more20(41));
    }

    @Test
    public void setMore20_20Test() {
        assertFalse(more20.more20(39));
    }

    @Test
    public void setMore20_21Test() {
        assertTrue(more20.more20(42));
    }

}