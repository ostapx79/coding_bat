package edu.coding_bat.warmup_1.missing_char;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingCharTest {
    MissingChar misChar = new MissingChar();
    @Test
    public void missingChar1Test() {
        assertEquals(misChar.missingChar("kitten", 1), "ktten");
    }

    @Test
    public void missingChar2Test() {
        assertEquals(misChar.missingChar("kitten", 0), "itten");
    }

    @Test
    public void missingChar3Test() {
        assertEquals(misChar.missingChar("kitten", 4), "kittn");
    }

    @Test
    public void missingChar4Test() {
        assertEquals(misChar.missingChar("Hi", 0), "i");
    }

    @Test
    public void missingChar5Test() {
        assertEquals(misChar.missingChar("Hi", 1), "H");
    }

    @Test
    public void missingChar6Test() {
        assertEquals(misChar.missingChar("code", 0), "ode");
    }

    @Test
    public void missingChar7Test() {
        assertEquals(misChar.missingChar("code", 1), "cde");
    }

    @Test
    public void missing8Test() {
        assertEquals(misChar.missingChar("code", 2), "coe");
    }

    @Test
    public void missing9Test() {
        assertEquals(misChar.missingChar("code", 3), "cod");
    }

}