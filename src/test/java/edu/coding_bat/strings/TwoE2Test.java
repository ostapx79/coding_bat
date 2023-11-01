package edu.coding_bat.strings;

import org.junit.jupiter.api.Test;

import static edu.coding_bat.strings.TwoE2.twoE2;
import static org.junit.jupiter.api.Assertions.*;

class TwoE2Test {
    @Test
    public void twoE2Test() {
        boolean chCountTrue = twoE2("week");
        boolean chCountFalse = twoE2("test");

        assertTrue(chCountTrue);
        assertFalse(chCountFalse);
    }
}