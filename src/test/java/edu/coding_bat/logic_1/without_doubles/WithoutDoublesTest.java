package edu.coding_bat.logic_1.without_doubles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutDoublesTest {
    WithoutDoubles withoutDoubles = new WithoutDoubles();

    @Test
    public void setWithoutDoubles1Test() {
        assertEquals(withoutDoubles.withoutDoubles(2, 3, true), 5);
    }

    @Test
    public void setWithoutDoubles2TEst() {
        assertEquals(withoutDoubles.withoutDoubles(3, 3, true), 7);
    }

    @Test
    public void setWithoutDoubles3Test() {
        assertEquals(withoutDoubles.withoutDoubles(3, 3, false), 6);
    }

    @Test
    public void setWithoutDoubles4Test() {
        assertEquals(withoutDoubles.withoutDoubles(2, 3, false), 5);
    }

    @Test
    public void setWithoutDoubles5Test() {
        assertEquals(withoutDoubles.withoutDoubles(5, 4, true), 9);
    }

    @Test
    public void setWithoutDoubles6Test() {
        assertEquals(withoutDoubles.withoutDoubles(5, 4, false), 9);
    }

    @Test
    public void setWithoutDoubles7Test() {
        assertEquals(withoutDoubles.withoutDoubles(5, 5, true), 11);
    }

    @Test
    public void setWithoutDoubles8Test() {
        assertEquals(withoutDoubles.withoutDoubles(5, 5, false), 10);
    }

    @Test
    public void setWithoutDoubles9Test() {
        assertEquals(withoutDoubles.withoutDoubles(6, 6, true), 7);
    }

    @Test
    public void setWithoutDoubles10Test() {
        assertEquals(withoutDoubles.withoutDoubles(6, 6, false), 12);
    }

    @Test
    public void setWithoutDoubles11Test() {
        assertEquals(withoutDoubles.withoutDoubles(1, 6, true), 7);
    }

    @Test
    public void setWithoutDoubles12Test() {
        assertEquals(withoutDoubles.withoutDoubles(1, 6, false), 7);
    }
}