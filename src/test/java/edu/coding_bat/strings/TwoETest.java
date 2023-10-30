package edu.coding_bat.strings;

import org.junit.jupiter.api.Test;

import static edu.coding_bat.strings.TwoE.twoE;
import static org.junit.jupiter.api.Assertions.*;

class TwoETest {
    @Test
    public void testTwoE() {
        boolean strE1 = twoE("text");
        boolean strE2 = twoE("week");

        assertFalse(strE1);
        assertTrue(strE2);
    }
}