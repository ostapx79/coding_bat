package edu.coding_bat.logic_1.teen_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenSumTest {
    TeenSum teenSum = new TeenSum();

    @Test
    public void setTeenSum1Test() {
        assertEquals(teenSum.teenSum(3, 4), 7);
    }

    @Test
    public void setTeenSum2Test() {
        assertEquals(teenSum.teenSum(10, 13), 19);
    }

    @Test
    public void setTeenSum3Test() {
        assertEquals(teenSum.teenSum(13, 2), 19);
    }

    @Test
    public void setTeenSum4Test() {
        assertEquals(teenSum.teenSum(3, 19), 19);
    }

    @Test
    public void setTeenSum5Test() {
        assertEquals(teenSum.teenSum(13, 13), 19);
    }

    @Test
    public void setTeenSum6Test() {
        assertEquals(teenSum.teenSum(10, 10), 20);
    }

    @Test
    public void setTeenSum7Test() {
        assertEquals(teenSum.teenSum(6, 14), 19);
    }

    @Test
    public void setTeenSum8Test() {
        assertEquals(teenSum.teenSum(15, 2), 19);
    }

    @Test
    public void setTeenSum9Test() {
        assertEquals(teenSum.teenSum(19, 19), 19);
    }

    @Test
    public void setTeenSum10Test() {
        assertEquals(teenSum.teenSum(19, 20), 19);
    }

    @Test
    public void setTeenSum11Test() {
        assertEquals(teenSum.teenSum(2, 18), 19);
    }

    @Test
    public void setTeenSum12Test() {
        assertEquals(teenSum.teenSum(12, 4), 16);
    }

    @Test
    public void setTeenSum13Test() {
        assertEquals(teenSum.teenSum(2, 20), 22);
    }

    @Test
    public void setTeenSum14Test() {
        assertEquals(teenSum.teenSum(2, 17), 19);
    }

    @Test
    public void setTeenSum15Test() {
        assertEquals(teenSum.teenSum(2, 16), 19);
    }

    @Test
    public void setTeenSum16Test() {
        assertEquals(teenSum.teenSum(6, 7), 13);
    }

}