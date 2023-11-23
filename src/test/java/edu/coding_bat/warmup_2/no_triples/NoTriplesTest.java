package edu.coding_bat.warmup_2.no_triples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoTriplesTest {
    NoTriples noTriples = new NoTriples();

    @Test
    public void setNoTriples1Test() {
        assertTrue(noTriples.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertTrue(noTriples.noTriplesT(new int[]{1, 1, 2, 2, 1}));
    }

    @Test
    public void setNoTriples2Test() {
        assertFalse(noTriples.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertFalse(noTriples.noTriplesT(new int[]{1, 1, 2, 2, 2, 1}));
    }

    @Test
    public void setNoTriples3Test() {
        assertFalse(noTriples.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertFalse(noTriples.noTriplesT(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }

    @Test
    public void setNoTriples4Test() {
        assertTrue(noTriples.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}));
        assertTrue(noTriples.noTriplesT(new int[]{1, 1, 2, 2, 1, 2, 1}));
    }

    @Test
    public void setNoTriples5Test() {
        assertTrue(noTriples.noTriples(new int[]{1, 2, 1}));
        assertTrue(noTriples.noTriplesT(new int[]{1, 2, 1}));
    }

    @Test
    public void setNoTriples6Test() {
        assertFalse(noTriples.noTriples(new int[]{1, 1, 1}));
        assertFalse(noTriples.noTriplesT(new int[]{1, 1, 1}));
    }

    @Test
    public void setNoTriples7Test() {
        assertTrue(noTriples.noTriples(new int[]{1, 1}));
        assertTrue(noTriples.noTriplesT(new int[]{1, 1}));
    }

    @Test
    public void setNoTriples8Test() {
        assertTrue(noTriples.noTriples(new int[]{1}));
        assertTrue(noTriples.noTriplesT(new int[]{1}));
    }

    @Test
    public void setNoTriples9Test() {
        assertTrue(noTriples.noTriples(new int[]{}));
        assertTrue(noTriples.noTriplesT(new int[]{}));
    }
}