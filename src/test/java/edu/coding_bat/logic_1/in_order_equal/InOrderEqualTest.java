package edu.coding_bat.logic_1.in_order_equal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InOrderEqualTest {
    InOrderEqual inOrderEqual = new InOrderEqual();

    @Test
    public void setInOrderEqual1Test() {
        assertTrue(inOrderEqual.inOrderEqual(2, 5, 11, false));
    }

    @Test
    public void setInOrderEqual2Test() {
        assertFalse(inOrderEqual.inOrderEqual(5, 7, 6, false));
    }

    @Test
    public void setInOrderEqual3Test() {
        assertTrue(inOrderEqual.inOrderEqual(5, 5, 7, true));
    }

    @Test
    public void setInOrderEqual4Test() {
        assertFalse(inOrderEqual.inOrderEqual(5, 5, 7, false));
    }

    @Test
    public void setInOrderEqual5Test() {
        assertFalse(inOrderEqual.inOrderEqual(2, 5, 4, false));
    }

    @Test
    public void setInOrderEqual6Test() {
        assertFalse(inOrderEqual.inOrderEqual(3, 4, 3, false));
    }

    @Test
    public void setInOrderEqual7Test() {
        assertFalse(inOrderEqual.inOrderEqual(3, 4, 4, false));
    }

    @Test
    public void setInOrderEqual8Test() {
        assertFalse(inOrderEqual.inOrderEqual(3, 4, 3, true));
    }

    @Test
    public void setInOrderEqual9Test() {
        assertTrue(inOrderEqual.inOrderEqual(3, 4, 4, true));
    }

    @Test
    public void setInOrderEqual10Test() {
        assertTrue(inOrderEqual.inOrderEqual(1, 5, 5, true));
    }

    @Test
    public void setInOrderEqual11Test() {
        assertTrue(inOrderEqual.inOrderEqual(5, 5, 5, true));
    }

    @Test
    public void setInOrderEqual12Test() {
        assertFalse(inOrderEqual.inOrderEqual(2, 2, 1, true));
    }

    @Test
    public void setInOrderEqual13Test() {
        assertFalse(inOrderEqual.inOrderEqual(9, 2, 2, true));
    }

    @Test
    public void setInOrderEqual14Test() {
        assertFalse(inOrderEqual.inOrderEqual(0, 1, 0, true));
    }
}