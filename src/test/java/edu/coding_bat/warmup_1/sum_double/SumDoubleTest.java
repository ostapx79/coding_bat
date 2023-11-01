package edu.coding_bat.warmup_1.sum_double;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {
    SumDouble sumDouble = new SumDouble();
    @Test
    public void sumDoubleTest() {
        int sum1 = sumDouble.sumDouble(1, 2);
        int sum2 = sumDouble.sumDouble(3, 2);
        int sum3 = sumDouble.sumDouble(2, 2);
        int sum4 = sumDouble.sumDouble(-1, 0);
        int sum5 = sumDouble.sumDouble(3, 3);
        int sum6 = sumDouble.sumDouble(0, 0);
        int sum7 = sumDouble.sumDouble(0, 1);
        int sum8 = sumDouble.sumDouble(3, 4);

        assertEquals(sum1, 3);
        assertEquals(sum2, 5);
        assertEquals(sum3, 8);
        assertEquals(sum4, -1);
        assertEquals(sum5, 12);
        assertEquals(sum6, 0);
        assertEquals(sum7, 1);
        assertEquals(sum8, 7);
    }

}