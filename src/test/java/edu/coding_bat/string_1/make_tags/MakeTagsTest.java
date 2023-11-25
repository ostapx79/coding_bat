package edu.coding_bat.string_1.make_tags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeTagsTest {
    MakeTags makeTags = new MakeTags();

    @Test
    public void setMakeTags1Test() {
        assertEquals(makeTags.makeTags("i", "Yay"), "<i>Yay</i>");
    }

    @Test
    public void setMakeTags2Test() {
        assertEquals(makeTags.makeTags("i", "Hello"), "<i>Hello</i>");
    }

    @Test
    public void setMakeTags3Test() {
        assertEquals(makeTags.makeTags("cite", "Yay"), "<cite>Yay</cite>");
    }

    @Test
    public void setMakeTags4Test() {
        assertEquals(makeTags.makeTags("address", "word"), "<address>word</address>");
    }

    @Test
    public void setMakeTags5Test() {
        assertEquals(makeTags.makeTags("body", "Heart"), "<body>Heart</body>");
    }

    @Test
    public void setMakeTags6Test() {
        assertEquals(makeTags.makeTags("i", "i"), "<i>i</i>");
    }

    @Test
    public void setMakeTags7Test() {
        assertEquals(makeTags.makeTags("i", ""), "<i></i>");
    }
}