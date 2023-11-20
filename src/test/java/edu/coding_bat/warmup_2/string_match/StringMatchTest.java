package edu.coding_bat.warmup_2.string_match;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchTest {
    StringMatch stringM = new StringMatch();

    @Test
    public void stringMatch1Test() {
        assertEquals(stringM.stringMatch("xxcaazz", "xxbaaz"), 3);
        assertEquals(stringM.stringMatchT("xxcaazz", "xxbaaz"), 3);
    }

    @Test
    public void stringMatch2Test() {
        assertEquals(stringM.stringMatch("abc", "abc"), 2);
        assertEquals(stringM.stringMatchT("abc", "abc"), 2);
    }

    @Test
    public void stringMatch3Test() {
        assertEquals(stringM.stringMatch("abc", "axc"), 0);
        assertEquals(stringM.stringMatchT("abc", "axc"), 0);
    }

    @Test
    public void stringMatch4Test() {
        assertEquals(stringM.stringMatch("hello", "he"), 1);
        assertEquals(stringM.stringMatchT("hello", "he"), 1);
    }

    @Test
    public void stringMatch5Test() {
        assertEquals(stringM.stringMatch("he", "hello"), 1);
        assertEquals(stringM.stringMatchT("he", "hello"), 1);
    }

    @Test
    public void stringMatch6Test() {
        assertEquals(stringM.stringMatch("", "hello"), 0);
        assertEquals(stringM.stringMatchT("", "hello"), 0);
    }

    @Test
    public void stringMatch7Test() {
        assertEquals(stringM.stringMatch("aabbccdd", "abbbxxd"), 1);
        assertEquals(stringM.stringMatchT("aabbccdd", "abbbxxd"), 1);
    }

    @Test
    public void stringMatch8Test() {
        assertEquals(stringM.stringMatch("aaxxaaxx", "iaxxai"), 3);
        assertEquals(stringM.stringMatchT("aaxxaaxx", "iaxxai"), 3);
    }

    @Test
    public void stringMatch9Test() {
        assertEquals(stringM.stringMatch("iaxxai", "aaxxaaxx"), 3);
        assertEquals(stringM.stringMatchT("iaxxai", "aaxxaaxx"), 3);
    }

}