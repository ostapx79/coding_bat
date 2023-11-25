package edu.coding_bat.string_1.make_our_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeOurWordTest {
    MakeOurWord makeOurWord = new MakeOurWord();

    @Test
    public void setMakeOurWord1Test() {
        assertEquals(makeOurWord.makeOurWord("<<>>", "Yay"), "<<Yay>>");
    }

    @Test
    public void setMakeOurWord2Test() {
        assertEquals(makeOurWord.makeOurWord("<<>>", "WooHoo"), "<<WooHoo>>");
    }

    @Test
    public void setMakeOurWord3Test() {
        assertEquals(makeOurWord.makeOurWord("[[]]", "word"), "[[word]]");
    }

    @Test
    public void setMakeOurWord4Test() {
        assertEquals(makeOurWord.makeOurWord("HHoo", "Hello"), "HHHellooo");
    }

    @Test
    public void setMakeOurWord5Test() {
        assertEquals(makeOurWord.makeOurWord("abyz", "YAY"), "abYAYyz");
    }
}