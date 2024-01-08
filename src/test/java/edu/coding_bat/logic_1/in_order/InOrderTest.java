package edu.coding_bat.logic_1.in_order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InOrderTest {
    InOrder inOrder = new InOrder();

    @Test
    public void setInOrder1Test() {
        assertTrue(inOrder.inOrder(1, 2, 4, false));
    }

    @Test
    public void setInOrder2Test() {
        assertFalse(inOrder.inOrder(1, 2, 1, false));
    }

    @Test
    public void setInOrder3Test() {
        assertTrue(inOrder.inOrder(1, 1, 2, true));
    }

    @Test
    public void setInOrder4Test() {
        assertFalse(inOrder.inOrder(3, 2, 4, false));
    }

    @Test
    public void setInOrder5Test() {
        assertTrue(inOrder.inOrder(2, 3, 4, false));
    }

    @Test
    public void setInOrder6Test() {
        assertTrue(inOrder.inOrder(3, 2, 4, true));
    }

    @Test
    public void setInOrder7Test() {
        assertFalse(inOrder.inOrder(4, 2, 2, true));
    }

    @Test
    public void setInOrder8Test() {
        assertFalse(inOrder.inOrder(4, 5, 2, true));
    }

    @Test
    public void setInOrder9Test() {
        assertTrue(inOrder.inOrder(2, 4, 6, true));
    }

    @Test
    public void setInOrder10Test() {
        assertTrue(inOrder.inOrder(7, 9, 10, false));
    }

    @Test
    public void setInOrder11Test() {
        assertTrue(inOrder.inOrder(7, 5, 6, true));
    }

    @Test
    public void setInOrder12Test() {
        assertFalse(inOrder.inOrder(7, 5, 4, true));
    }

}