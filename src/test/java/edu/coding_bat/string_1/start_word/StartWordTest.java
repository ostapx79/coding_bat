package edu.coding_bat.string_1.start_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartWordTest {
    StartWord startWord = new StartWord();

    @Test
    public void setStartWord1Test() {
        assertEquals(startWord.startWord("hippo", "hi"), "hi");
    }

    @Test
    public void setStartWord2Test() {
        assertEquals(startWord.startWord("hippo", "zip"), "hip");
    }

    @Test
    public void setStartWord3Test() {
        assertEquals(startWord.startWord("hippo", "i"), "h");
    }

}