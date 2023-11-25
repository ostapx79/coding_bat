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

    @Test
    public void setHelloName4Test() {
        assertEquals(helloName.helloName("Dolly"), "Hello, Dolly!");
    }

    @Test
    public void setHelloName5Test() {
        assertEquals(helloName.helloName("Alpha"), "Hello, Alpha!");
    }

    @Test
    public void setHelloName6Test() {
        assertEquals(helloName.helloName("Omega"), "Hello, Omega!");
    }

    @Test
    public void setHelloName7Test() {
        assertEquals(helloName.helloName("Goodbye"), "Hello, Goodbye!");
    }

    @Test
    public void setHelloName8Test() {
        assertEquals(helloName.helloName("ho ho ho"), "Hello, ho ho ho!");
    }

    @Test
    public void setHelloName9Test() {
        assertEquals(helloName.helloName("xyz"), "Hello, xyz!");
    }

    @Test
    public void setHelloName10Test() {
        assertEquals(helloName.helloName("Hello"), "Hello, Hello!");
    }

}