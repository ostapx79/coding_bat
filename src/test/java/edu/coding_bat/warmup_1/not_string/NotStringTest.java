package edu.coding_bat.warmup_1.not_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotStringTest {
    NotString notString = new NotString();

    @Test
    public void notString1Test() {
        assertEquals(notString.notString("candy"), "not candy");
    }

    @Test
    public void notString2Test() {
        assertEquals(notString.notString("x"), "not x");
    }

    @Test
    public void notString3Test() {
        assertEquals(notString.notString("not bad"), "not bad");
    }

    @Test
    public void notString4Test() {
        assertEquals(notString.notString("bad"), "not bad");
    }

    @Test
    public void notString5Test() {
        assertEquals(notString.notString("not"), "not");
    }

    @Test
    public void notString6Test() {
        assertEquals(notString.notString("is not"), "not is not");
    }

    @Test
    public void notString7Test() {
        assertEquals(notString.notString("no"), "not no");
    }

}