package edu.coding_bat.warmup_2.string_yak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {
    StringYak stringYak = new StringYak();

    @Test
    public void stringYak1Test() {
        assertEquals(stringYak.stringYak("yakpak"), "pak");
        assertEquals(stringYak.stringYakT("yakpak"), "pak");
    }

    @Test
    public void stringYak2Test() {
        assertEquals(stringYak.stringYak("pakyak"), "pak");
        assertEquals(stringYak.stringYakT("pakyak"), "pak");
    }

    @Test
    public void stringYak3Test() {
        assertEquals(stringYak.stringYak("yak123ya"), "123ya");
        assertEquals(stringYak.stringYakT("yak123ya"), "123ya");
    }

    @Test
    public void stringYak4Test() {
        assertEquals(stringYak.stringYak("yak"), "");
        assertEquals(stringYak.stringYakT("yak"), "");
    }

    @Test
    public void stringYak5Test() {
        assertEquals(stringYak.stringYak("yakxxxyak"), "xxx");
        assertEquals(stringYak.stringYakT("yakxxxyak"), "xxx");
    }

    @Test
    public void stringYak6Test() {
        assertEquals(stringYak.stringYak("HiyakHi"), "HiHi");
        assertEquals(stringYak.stringYakT("HiyakHi"), "HiHi");
    }

    @Test
    public void stringYak7Test() {
        assertEquals(stringYak.stringYak("xxxyakyyyakzzz"), "xxxyyzzz");
        assertEquals(stringYak.stringYakT("xxxyakyyyakzzz"), "xxxyyzzz");
    }

}