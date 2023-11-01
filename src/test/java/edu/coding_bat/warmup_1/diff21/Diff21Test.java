package edu.coding_bat.warmup_1.diff21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {
    Diff21 diff = new Diff21();
    @Test
    public void diff21Test() {
        int res1 = diff.diff21(19);
        int res2 = diff.diff21(10);
        int res3 = diff.diff21(21);
        int res4 = diff.diff21(22);
        int res5 = diff.diff21(25);
        int res6 = diff.diff21(30);
        int res7 = diff.diff21(0);
        int res8 = diff.diff21(1);
        int res9 = diff.diff21(2);
        int res10 = diff.diff21(-1);
        int res11 = diff.diff21(-2);
        int res12 = diff.diff21(50);

        assertEquals(res1, 2);
        assertEquals(res2, 11);
        assertEquals(res3, 0);
        assertEquals(res4, 2);
        assertEquals(res5, 8);
        assertEquals(res6, 18);
        assertEquals(res7, 21);
        assertEquals(res8, 20);
        assertEquals(res9, 19);
        assertEquals(res10, 22);
        assertEquals(res11, 23);
        assertEquals(res12, 58);
    }

}