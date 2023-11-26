package edu.coding_bat.string_1.first_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTwoTest {
    FirstTwo firstTwo = new FirstTwo();

    @Test
    public void setFirstTwo1Test() {
        assertEquals(firstTwo.firstTwo("Hello"), "He");
    }

    @Test
    public void setFirstTwo2Test() {
        assertEquals(firstTwo.firstTwo("abcdefg"), "ab");
    }

    @Test
    public void setFirstTwo3Test() {
        assertEquals(firstTwo.firstTwo("ab"), "ab");
    }

    @Test
    public void setFirstTwo4Test() {
        assertEquals(firstTwo.firstTwo("a"), "a");
    }

    @Test
    public void setFirstTwo5Test() {
        assertEquals(firstTwo.firstTwo(""), "");
    }

    @Test
    public void setFirstTwo6Test() {
        assertEquals(firstTwo.firstTwo("Kitten"), "Ki");
    }

    @Test
    public void setFirstTwo7Test() {
        assertEquals(firstTwo.firstTwo("hi"), "hi");
    }

    @Test
    public void setFirstTwo8Test() {
        assertEquals(firstTwo.firstTwo("hiya"), "hi");
    }

}