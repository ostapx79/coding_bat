package edu.coding_bat.logic_1.less20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Less20Test {
    Less20 less20 = new Less20();

    @Test
    public void setLess20_1Test() {
        assertTrue(less20.less20(18));
    }

    @Test
    public void setLess20_2Test() {
        assertTrue(less20.less20(19));
    }

    @Test
    public void setLess20_3Test() {
        assertFalse(less20.less20(20));
    }

    @Test
    public void setLess20_4Test() {
        assertFalse(less20.less20(8));
    }

    @Test
    public void setLess20_5Test() {
        assertFalse(less20.less20(17));
    }

    @Test
    public void setLess20_6Test() {
        assertFalse(less20.less20(23));
    }

    @Test
    public void setLess20_7Test() {
        assertFalse(less20.less20(25));
    }

    @Test
    public void setLess20_8Test() {
        assertFalse(less20.less20(30));
    }

    @Test
    public void setLess20_9TEst() {
        assertFalse(less20.less20(31));
    }

    @Test
    public void setLess20_10Test() {
        assertTrue(less20.less20(58));
    }

    @Test
    public void setLess20_11Test() {
        assertTrue(less20.less20(59));
    }

    @Test
    public void setLess20_12Test() {
        assertFalse(less20.less20(60));
    }

    @Test
    public void setLess20_13Test() {
        assertFalse(less20.less20(61));
    }

    @Test
    public void setLess20_14Test() {
        assertFalse(less20.less20(62));
    }

    @Test
    public void setLess20_15Test() {
        assertFalse(less20.less20(1017));
    }

    @Test
    public void setLess20_16Test() {
        assertTrue(less20.less20(1018));
    }

    @Test
    public void setLess20_17Test() {
        assertTrue(less20.less20(1019));
    }

    @Test
    public void setLess20_18Test() {
        assertFalse(less20.less20(1020));
    }

    @Test
    public void setLess20_19Test() {
        assertFalse(less20.less20(1021));
    }

    @Test
    public void setLess20_20Test() {
        assertFalse(less20.less20(1022));
    }

    @Test
    public void setLess20_21Test() {
        assertFalse(less20.less20(1023));
    }

    @Test
    public void setLess20_22Test() {
        assertFalse(less20.less20(37));
    }
}