package edu.coding_bat.logic_1.near_ten;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearTenTest {
    NearTen nearTen = new NearTen();

    @Test
    public void setNearTen1Test() {
        assertTrue(nearTen.nearTen(12));
    }

    @Test
    public void setNearTen2Test() {
        assertFalse(nearTen.nearTen(17));
    }

    @Test
    public void setNearTen3Test() {
        assertTrue(nearTen.nearTen(19));
    }

    @Test
    public void setNearTen4Test() {
        assertTrue(nearTen.nearTen(31));
    }

    @Test
    public void setNearTen5Test() {
        assertFalse(nearTen.nearTen(6));
    }

    @Test
    public void setNearTen6Test() {
        assertTrue(nearTen.nearTen(10));
    }

    @Test
    public void setNearTen7Test() {
        assertTrue(nearTen.nearTen(11));
    }

    @Test
    public void setNearTen8Test() {
        assertTrue(nearTen.nearTen(21));
    }

    @Test
    public void setNearTen9Test() {
        assertTrue(nearTen.nearTen(22));
    }

    @Test
    public void setNearTen10Test() {
        assertFalse(nearTen.nearTen(23));
    }

    @Test
    public void setNearTen11Test() {
        assertFalse(nearTen.nearTen(54));
    }

    @Test
    public void setNearTen12TEst() {
        assertFalse(nearTen.nearTen(155));
    }

    @Test
    public void setNearTen13Test() {
        assertTrue(nearTen.nearTen(158));
    }

    @Test
    public void setNearTen14Test() {
        assertFalse(nearTen.nearTen(3));
    }

    @Test
    public void setNearTen15Test() {
        assertTrue(nearTen.nearTen(1));
    }
}