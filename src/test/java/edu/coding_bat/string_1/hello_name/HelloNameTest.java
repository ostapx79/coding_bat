package edu.coding_bat.string_1.hello_name;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {
    HelloName helloName = new HelloName();

    @Test
    public void setHelloName1Test() {
        assertEquals(helloName.helloName("Bob"), "Hello, Bob!");
    }

    @Test
    public void setHelloName2Test() {
        assertEquals(helloName.helloName("Alice"), "Hello, Alice!");
    }

    @Test
    public void setHelloName3Test() {
        assertEquals(helloName.helloName("X"), "Hello, X!");
    }

}