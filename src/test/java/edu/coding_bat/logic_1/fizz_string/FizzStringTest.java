package edu.coding_bat.logic_1.fizz_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzStringTest {
    FizzString fizzString = new FizzString();

    @Test
    public void setFizzString1Test() {
        assertEquals(fizzString.fizzString("fig"), "Fizz");
    }

    @Test
    public void setFizzString2Test() {
        assertEquals(fizzString.fizzString("dib"), "Buzz");
    }

    @Test
    public void setFizzString3Test() {
        assertEquals(fizzString.fizzString("fib"), "FizzBuzz");
    }

    @Test
    public void setFizzString4Test() {
        assertEquals(fizzString.fizzString("abc"), "abc");
    }

    @Test
    public void setFizzString5Test() {
        assertEquals(fizzString.fizzString("fooo"), "Fizz");
    }

    @Test
    public void setFizzString6Test() {
        assertEquals(fizzString.fizzString("booo"), "booo");
    }

    @Test
    public void setFizzString7Test() {
        assertEquals(fizzString.fizzString("ooob"), "Buzz");
    }

    @Test
    public void setFizzString8Test() {
        assertEquals(fizzString.fizzString("fooob"), "FizzBuzz");
    }

    @Test
    public void setFizzString9Test() {
        assertEquals(fizzString.fizzString("f"), "Fizz");
    }

    @Test
    public void setFizzString10Test() {
        assertEquals(fizzString.fizzString("b"), "Buzz");
    }

    @Test
    public void setFizzString11Test() {
        assertEquals(fizzString.fizzString("abcb"), "Buzz");
    }

    @Test
    public void setFizzString13Test() {
        assertEquals(fizzString.fizzString("Hello"), "Hello");
    }

    @Test
    public void setFizzString14Test() {
        assertEquals(fizzString.fizzString("Hellob"), "Buzz");
    }

    @Test
    public void setFizzString15Test() {
        assertEquals(fizzString.fizzString("af"), "af");
    }

    @Test
    public void setFizzString16Test() {
        assertEquals(fizzString.fizzString("bf"), "bf");
    }

    @Test
    public void setFizzString17Test() {
        assertEquals(fizzString.fizzString("fb"), "FizzBuzz");
    }
}