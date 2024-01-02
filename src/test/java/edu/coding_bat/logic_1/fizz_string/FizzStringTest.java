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

}