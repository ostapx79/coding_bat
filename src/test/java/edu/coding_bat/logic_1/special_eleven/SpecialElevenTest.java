package edu.coding_bat.logic_1.special_eleven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialElevenTest {
    SpecialEleven specialEleven = new SpecialEleven();

    @Test
    public void setSpecialEleven1Test() {
        assertTrue(specialEleven.specialEleven(22));
    }

    @Test
    public void setSpecialEleven2Test() {
        assertTrue(specialEleven.specialEleven(23));
    }

    @Test
    public void setSpecialEleven3Test() {
        assertFalse(specialEleven.specialEleven(24));
    }

    @Test
    public void setSpecialEleven4Test() {
        assertFalse(specialEleven.specialEleven(21));
    }

    @Test
    public void setSpecialEleven5Test() {
        assertTrue(specialEleven.specialEleven(11));
    }

    @Test
    public void setSpecialEleven6Test() {
        assertTrue(specialEleven.specialEleven(12));
    }

    @Test
    public void setSpecialEleven7Test() {
        assertFalse(specialEleven.specialEleven(10));
    }

    @Test
    public void setSpecialEleven8Test() {
        assertFalse(specialEleven.specialEleven(9));
    }

    @Test
    public void setSpecialEleven9Test() {
        assertFalse(specialEleven.specialEleven(8));
    }

    @Test
    public void setSpecialEleven10Test() {
        assertTrue(specialEleven.specialEleven(0));
    }

    @Test
    public void setSpecialEleven11Test() {
        assertTrue(specialEleven.specialEleven(1));
    }

    @Test
    public void setSpecialEleven12Test() {
        assertFalse(specialEleven.specialEleven(2));
    }

    @Test
    public void setSpecialEleven13Test() {
        assertTrue(specialEleven.specialEleven(121));
    }

    @Test
    public void setSpecialEleven14Test() {
        assertTrue(specialEleven.specialEleven(122));
    }

    @Test
    public void setSpecialEleven15Test() {
        assertFalse(specialEleven.specialEleven(123));
    }

    @Test
    public void setSpecialEleven16Test() {
        assertFalse(specialEleven.specialEleven(46));
    }

    @Test
    public void setSpecialEleven17Test() {
        assertFalse(specialEleven.specialEleven(49));
    }

    @Test
    public void setSpecialEleven18Test() {
        assertFalse(specialEleven.specialEleven(52));
    }

    @Test
    public void setSpecialEleven19TEst() {
        assertFalse(specialEleven.specialEleven(54));
    }

    @Test
    public void setSpecialEleven20Test() {
        assertTrue(specialEleven.specialEleven(55));
    }

}