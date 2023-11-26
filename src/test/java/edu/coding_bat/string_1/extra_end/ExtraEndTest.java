package edu.coding_bat.string_1.extra_end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraEndTest {
    ExtraEnd extraEnd = new ExtraEnd();

    @Test
    public void setExtraEnd1Test() {
        assertEquals(extraEnd.extraEnd("hello"), "lololo");
    }

    @Test
    public void setExtraEnd2Test() {
        assertEquals(extraEnd.extraEnd("ab"), "ababab");
    }

    @Test
    public void setExtraEnd3Test() {
        assertEquals(extraEnd.extraEnd("Hi"), "HiHiHi");
    }

    @Test
    public void setExtraEnd4Test() {
        assertEquals(extraEnd.extraEnd("Candy"), "dydydy");
    }

    @Test
    public void setExtraEnd5Test() {
        assertEquals(extraEnd.extraEnd("Code"), "dedede");
    }
}