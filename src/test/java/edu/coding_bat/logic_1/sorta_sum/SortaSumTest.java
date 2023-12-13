package edu.coding_bat.logic_1.sorta_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortaSumTest {
    SortaSum sortaSum = new SortaSum();

    @Test
    public void setSortaSum1Test() {
        assertEquals(sortaSum.sortaSum(3, 4), 7);
    }

    @Test
    public void setSortaSum2Test() {
        assertEquals(sortaSum.sortaSum(9, 4), 20);
    }

    @Test
    public void setSortaSum3Test() {
        assertEquals(sortaSum.sortaSum(10, 11), 21);
    }

    @Test
    public void setSortaSum4Test() {
        assertEquals(sortaSum.sortaSum(12, -3), 9);
    }

    @Test
    public void setSortaSum5Test() {
        assertEquals(sortaSum.sortaSum(-3, 12), 9);
    }

    @Test()
    public void setSortaSum6Test() {
        assertEquals(sortaSum.sortaSum(4, 5), 9);
    }

    @Test
    public void setSortaSum7Test() {
        assertEquals(sortaSum.sortaSum(4, 6), 20);
    }

    @Test
    public void setSortaSum8Test() {
        assertEquals(sortaSum.sortaSum(14, 7), 21);
    }

    @Test
    public void setSortaSum9Test() {
        assertEquals(sortaSum.sortaSum(14, 6), 20);
    }

}