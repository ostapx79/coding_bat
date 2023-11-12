package edu.coding_bat.warmup_2.string_times;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {
    StringTimes stringT = new StringTimes();

    @Test
    public void stringTimes1Test() {
        assertEquals(stringT.stringTimes("Hi", 2), "HiHi");
    }

    @Test
    public void stringTimes2Test() {
        assertEquals(stringT.stringTimes("Hi", 3), "HiHiHi");
    }

    @Test
    public void stringTimes3Test() {
        assertEquals(stringT.stringTimes("Hi", 1), "Hi");
    }

    @Test
    public void stringTimes4Test() {
        assertEquals(stringT.stringTimes("Hi", 0), "");
    }

    @Test
    public void stringTimes5Test() {
        assertEquals(stringT.stringTimes("Oh boy!", 2), "Oh boy!Oh boy!");
    }

    @Test
    public void stringTimes6Test() {
        assertEquals(stringT.stringTimes("x", 4), "xxxx");
    }

    @Test
    public void stringTimes7Test() {
        assertEquals(stringT.stringTimes("", 4), "");
    }

    @Test
    public void stringTimes8Test() {
        assertEquals(stringT.stringTimes("code", 2), "codecode");
    }

    @Test
    public void stringTimes9Test() {
        assertEquals(stringT.stringTimes("code", 3), "codecodecode");
    }

}