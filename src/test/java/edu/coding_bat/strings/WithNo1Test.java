package edu.coding_bat.strings;

import org.junit.jupiter.api.Test;

import static edu.coding_bat.strings.WithNo1.withNo1;
import static org.junit.jupiter.api.Assertions.*;

class WithNo1Test {
    @Test
    public void testWithNo1() {
        String str = withNo1("text");
        assertEquals(str, "No:text");
    }
}