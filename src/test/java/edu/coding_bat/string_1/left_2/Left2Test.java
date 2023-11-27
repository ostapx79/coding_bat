package edu.coding_bat.string_1.left_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Left2Test {
    Left2 left2 = new Left2();

    @Test
    public void setLeft2_1Test() {
        assertEquals(left2.left2("Hello"), "lloHe");
    }

    @Test
    public void setLeft2_2Test() {
        assertEquals(left2.left2("java"), "vaja");
    }

    @Test
    public void setLeft2_3Test() {
        assertEquals(left2.left2("Hi"), "Hi");
    }

    @Test
    public void setLeft2_4Test() {
        assertEquals(left2.left2("code"), "deco");
    }

    @Test
    public void setLeft2_5Test() {
        assertEquals(left2.left2("cat"), "tca");
    }

    @Test
    public void setLeft2_6Test() {
        assertEquals(left2.left2("12345"), "34512");
    }

    @Test
    public void setLeft2_7Test() {
        assertEquals(left2.left2("Chocolate"), "ocolateCh");
    }

    @Test
    public void setLeft2_8Test() {
        assertEquals(left2.left2("bricks"), "icksbr");
    }

}