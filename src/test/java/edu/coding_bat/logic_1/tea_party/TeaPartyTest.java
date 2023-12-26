package edu.coding_bat.logic_1.tea_party;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeaPartyTest {
    TeaParty teaParty = new TeaParty();

    @Test
    public void setTeaParty1Test() {
        assertEquals(teaParty.teaParty(6, 8), 1);
    }

    @Test
    public void setTeaParty2Test() {
        assertEquals(teaParty.teaParty(3, 8), 0);
    }

    @Test
    public void setTeaParty3Test() {
        assertEquals(teaParty.teaParty(20, 6), 2);
    }

    @Test
    public void setTeaParty4Test() {
        assertEquals(teaParty.teaParty(12, 6), 2);
    }

    @Test
    public void setTeaParty5Test() {
        assertEquals(teaParty.teaParty(11, 6), 1);
    }


    @Test
    public void setTeaParty6Test() {
        assertEquals(teaParty.teaParty(11, 4), 0);
    }

    @Test
    public void setTeaParty7Test() {
        assertEquals(teaParty.teaParty(4, 5), 0);
    }

    @Test
    public void setTeaParty8Test() {
        assertEquals(teaParty.teaParty(5, 5), 1);
    }

    @Test
    public void setTeaParty9Test() {
        assertEquals(teaParty.teaParty(6, 6), 1);
    }

    @Test
    public void setTeaParty10Test() {
        assertEquals(teaParty.teaParty(5, 10), 2);
    }

    @Test
    public void setTeaParty11Test() {
        assertEquals(teaParty.teaParty(5, 9), 1);
    }

    @Test
    public void setTeaParty12Test() {
        assertEquals(teaParty.teaParty(10, 4), 0);
    }

    @Test
    public void setTeaParty13Test() {
        assertEquals(teaParty.teaParty(10, 20), 2);
    }

}