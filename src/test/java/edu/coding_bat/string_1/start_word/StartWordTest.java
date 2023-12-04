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

    @Test
    public void setStartWord4Test() {
        assertEquals(startWord.startWord("hippo", "ix"), "");
    }

    @Test
    public void setStartWord5Test() {
        assertEquals(startWord.startWord("h", "ix"), "");
    }

    @Test
    public void setStartWord6Test() {
        assertEquals(startWord.startWord("", "i"), "");
    }

    @Test
    public void setStartWord7Test() {
        assertEquals(startWord.startWord("hip", "zi"), "hi");
    }

    @Test
    public void setStartWord8Test() {
        assertEquals(startWord.startWord("hip", "zip"), "hip");
    }

    @Test
    public void setStartWord9Test() {
        assertEquals(startWord.startWord("hip", "zig"), "");
    }

    @Test
    public void setStartWord10Test() {
        assertEquals(startWord.startWord("h", "z"), "h");
    }

    @Test
    public void setStartWord11Test() {
        assertEquals(startWord.startWord("hippo", "xippo"), "hippo");
    }

    @Test
    public void setStartWord12Test() {
        assertEquals(startWord.startWord("hippo", "xyz"), "");
    }

    @Test
    public void setStartWord13Test() {
        assertEquals(startWord.startWord("hippo", "hip"), "hip");
    }

    @Test
    public void setStartWord14Test() {
        assertEquals(startWord.startWord("kitten", "cit"), "kit");
    }

    @Test
    public void setStartWord15Test() {
        assertEquals(startWord.startWord("kit", "cit"), "kit");
    }

}