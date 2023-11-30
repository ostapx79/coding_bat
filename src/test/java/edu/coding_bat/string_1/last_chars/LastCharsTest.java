package edu.coding_bat.string_1.last_chars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastCharsTest {
    LastChars lastChars = new LastChars();

    @Test
    public void setLastChars1Test() {
        assertEquals(lastChars.lastChars("last", "chars"), "ls");
    }

    @Test
    public void setLastChars2TEst() {
        assertEquals(lastChars.lastChars("yo", "java"), "ya");
    }

    @Test
    public void setLastChars3Test() {
        assertEquals(lastChars.lastChars("hi", ""), "h@");
    }

    @Test
    public void setLastChars4Test() {
        assertEquals(lastChars.lastChars("", "hello"), "@o");
    }

    @Test
    public void setLastChars5Test() {
        assertEquals(lastChars.lastChars("", ""), "@@");
    }

    @Test
    public void setLastChars6Test() {
        assertEquals(lastChars.lastChars("kitten", "hi"), "ki");
    }

    @Test
    public void setLastChars7Test() {
        assertEquals(lastChars.lastChars("k", "zip"), "kp");
    }

    @Test
    public void setLastChars8Test() {
        assertEquals(lastChars.lastChars("kitten", ""), "k@");
    }

    @Test
    public void setLastChars9Test() {
        assertEquals(lastChars.lastChars("kitten", "zip"), "kp");
    }

}