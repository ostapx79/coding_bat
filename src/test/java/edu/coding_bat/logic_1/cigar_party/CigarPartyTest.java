package edu.coding_bat.logic_1.cigar_party;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CigarPartyTest {
    CigarParty cigarParty = new CigarParty();

    @Test
    public void setCigarParty1Test() {
        assertFalse(cigarParty.cigarParty(30, false));
    }

    @Test
    public void setCigarParty2Test() {
        assertTrue(cigarParty.cigarParty(50, false));
    }

    @Test
    public void setCigarParty3Test() {
        assertTrue(cigarParty.cigarParty(70, true));
    }

    @Test
    public void setCigarParty4Test() {
        assertFalse(cigarParty.cigarParty(30, true));
    }

    @Test
    public void setCigarParty5Test() {
        assertTrue(cigarParty.cigarParty(50, true));
    }

    @Test
    public void setCigarParty6Test() {
        assertTrue(cigarParty.cigarParty(60, false));
    }

    @Test
    public void setCigarParty7Test() {
        assertFalse(cigarParty.cigarParty(61, false));
    }

    @Test
    public void setCigarParty8Test() {
        assertTrue(cigarParty.cigarParty(40, false));
    }

    @Test
    public void setCigarParty9Test() {
        assertFalse(cigarParty.cigarParty(39, false));
    }

    @Test
    public void setCigarParty10Test() {
        assertTrue(cigarParty.cigarParty(40, true));
    }

    @Test
    public void setCigarParty11Test() {
        assertFalse(cigarParty.cigarParty(39, true));
    }

}