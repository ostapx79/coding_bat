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

}