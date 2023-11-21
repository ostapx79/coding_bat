package edu.coding_bat.warmup_2.alt_pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {
    AltPairs altPairs = new AltPairs();

    @Test
    public void altPairs1Test() {
        assertEquals(altPairs.altPairs("kitten"), "kien");
    }

    @Test
    public void altPairs2Test() {
        assertEquals(altPairs.altPairs("Chocolate"), "Chole");
    }

    @Test
    public void altPairs3Test() {
        assertEquals(altPairs.altPairs("CodingHorror"), "Congrr");
    }

}