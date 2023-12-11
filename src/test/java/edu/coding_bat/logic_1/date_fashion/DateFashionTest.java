package edu.coding_bat.logic_1.date_fashion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class DateFashionTest {
    DateFashion dateFashion = new DateFashion();

    @Test
    public void setDateFashion1Test() {
        assertEquals(dateFashion.dateFashion(5, 10), 2);
    }

    @Test
    public void setDateFashion2Test() {
        assertEquals(dateFashion.dateFashion(5, 2), 0);
    }

    @Test
    public void setDateFashion3Test() {
        assertEquals(dateFashion.dateFashion(5, 5), 1);
    }

    @Test
    public void setDateFashion4Test() {
        assertEquals(dateFashion.dateFashion(3, 3), 1);
    }

    @Test
    public void setDateFashion5Test() {
        assertEquals(dateFashion.dateFashion(10, 2), 0);
    }

    @Test
    public void setDateFashion6Test() {
        assertEquals(dateFashion.dateFashion(2, 9), 0);
    }

    @Test
    public void setDateFashion7Test() {
        assertEquals(dateFashion.dateFashion(9, 9), 2);
    }

    @Test
    public void setDateFashion8Test() {
        assertEquals(dateFashion.dateFashion(10, 5), 2);
    }

    @Test
    public void setDateFashion9Test() {
        assertEquals(dateFashion.dateFashion(2, 2), 0);
    }

    @Test
    public void setDateFashion10Test() {
        assertEquals(dateFashion.dateFashion(3, 7), 1);
    }

    @Test
    public void setDateFashion11Test() {
        assertEquals(dateFashion.dateFashion(2, 7), 0);
    }

    @Test
    public void setDateFashion12Test() {
        assertEquals(dateFashion.dateFashion(6, 2), 0);
    }

}