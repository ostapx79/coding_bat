package edu.coding_bat.warmup_2.alt_pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {
    AltPairs altPairs = new AltPairs();

    @Test
    public void altPairs1Test() {
        assertEquals(altPairs.altPairs("kitten"), "kien");
        assertEquals(altPairs.altPairsT("kitten"), "kien");
    }

    @Test
    public void altPairs2Test() {
        assertEquals(altPairs.altPairs("Chocolate"), "Chole");
        assertEquals(altPairs.altPairsT("Chocolate"), "Chole");
    }

    @Test
    public void altPairs3Test() {
        assertEquals(altPairs.altPairs("CodingHorror"), "Congrr");
        assertEquals(altPairs.altPairsT("CodingHorror"), "Congrr");
    }

    @Test
    public void altPairs4Test() {
        assertEquals(altPairs.altPairs("yak"), "ya");
        assertEquals(altPairs.altPairsT("yak"), "ya");
    }

    @Test
    public void altPairs5Test() {
        assertEquals(altPairs.altPairs("ya"), "ya");
        assertEquals(altPairs.altPairsT("ya"), "ya");
    }

    @Test
    public void altPairs6Test() {
        assertEquals(altPairs.altPairs("y"), "y");
        assertEquals(altPairs.altPairsT("y"), "y");
    }

    @Test
    public void altPairs7Test() {
        assertEquals(altPairs.altPairs(""), "");
        assertEquals(altPairs.altPairsT(""), "");
    }

    @Test
    public void altPairs8Test() {
        assertEquals(altPairs.altPairs("ThisThatTheOther"), "ThThThth");
        assertEquals(altPairs.altPairsT("ThisThatTheOther"), "ThThThth");
    }

}