package edu.coding_bat.warmup_1.del_del;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {
    DelDel delD = new DelDel();

    @Test
    public void delDel1Test() {
        assertEquals(delD.delDel("adelbc"), "abc");
    }

    @Test
    public void delDel2Test() {
        assertEquals(delD.delDel("adelHello"), "aHello");
    }

    @Test
    public void delDel3Test() {
        assertEquals(delD.delDel("adedbc"), "adedbc");
    }

    @Test
    public void delDel7Test() {
        assertEquals(delD.delDel("abcdel"), "abcdel");
    }

    @Test
    public void delDel8Test() {
        assertEquals(delD.delDel("add"), "add");
    }

    @Test
    public void delDel9Test() {
        assertEquals(delD.delDel("ad"), "ad");
    }

    @Test
    public void delDel10Test() {
        assertEquals(delD.delDel("a"), "a");
    }

    @Test
    public void delDel11Test() {
        assertEquals(delD.delDel(""), "");
    }

    @Test
    public void delDel12Test() {
        assertEquals(delD.delDel("del"), "del");
    }

    @Test
    public void delDel13Test() {
        assertEquals(delD.delDel("adel"), "a");
    }

    @Test
    public void delDel14Test() {
        assertEquals(delD.delDel("aadelbb"), "aadelbb");
    }


    @Test
    public void delDel15Test() {
        assertEquals(delD.delDelT("adelbc"), "abc");
    }

    @Test
    public void delDel16Test() {
        assertEquals(delD.delDelT("adelHello"), "aHello");
    }

    @Test
    public void delDel17Test() {
        assertEquals(delD.delDelT("adedbc"), "adedbc");
    }

    @Test
    public void delDel18Test() {
        assertEquals(delD.delDelT("abcdel"), "abcdel");
    }

    @Test
    public void delDel19Test() {
        assertEquals(delD.delDelT("add"), "add");
    }

    @Test
    public void delDel20Test() {
        assertEquals(delD.delDelT("ad"), "ad");
    }

    @Test
    public void delDel21Test() {
        assertEquals(delD.delDelT("a"), "a");
    }

    @Test
    public void delDel22Test() {
        assertEquals(delD.delDelT(""), "");
    }

    @Test
    public void delDel23Test() {
        assertEquals(delD.delDelT("del"), "del");
    }

    @Test
    public void delDel24Test() {
        assertEquals(delD.delDelT("adel"), "a");
    }

    @Test
    public void delDel25Test() {
        assertEquals(delD.delDelT("aadelbb"), "aadelbb");
    }
}