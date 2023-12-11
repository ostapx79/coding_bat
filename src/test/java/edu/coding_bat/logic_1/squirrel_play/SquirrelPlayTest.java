package edu.coding_bat.logic_1.squirrel_play;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquirrelPlayTest {
    SquirrelPlay squirrelPlay = new SquirrelPlay();

    @Test
    public void setSquirrelPlay1Test() {
        assertTrue(squirrelPlay.squirrelPlay(70, false));
    }

    @Test
    public void setSquirrelPlay2Test() {
        assertFalse(squirrelPlay.squirrelPlay(95, false));
    }

    @Test
    public void setSquirrelPlay3Test() {
        assertTrue(squirrelPlay.squirrelPlay(95, true));
    }

    @Test
    public void setSquirrelPlay4Test() {
        assertTrue(squirrelPlay.squirrelPlay(90, false));
    }

    @Test
    public void setSquirrelPlay5Test() {
        assertTrue(squirrelPlay.squirrelPlay(90, true));
    }

    @Test
    public void setSquirrelPlay6Test() {
        assertFalse(squirrelPlay.squirrelPlay(50, false));
    }

    @Test
    public void setSquirrelPlay7Test() {
        assertFalse(squirrelPlay.squirrelPlay(50, true));
    }

    @Test
    public void setSquirrelPlay8Test() {
        assertFalse(squirrelPlay.squirrelPlay(100, false));
    }

    @Test
    public void setSquirrelPlay9Test() {
        assertTrue(squirrelPlay.squirrelPlay(100, true));
    }

    @Test
    public void setSquirrelPlay10Test() {
        assertFalse(squirrelPlay.squirrelPlay(105, true));
    }

    @Test
    public void setSquirrelPlay11Test() {
        assertFalse(squirrelPlay.squirrelPlay(59, false));
    }

    @Test
    public void setSquirrelPlay12Test() {
        assertFalse(squirrelPlay.squirrelPlay(59, true));
    }

    @Test
    public void setSquirrelPlay13Test() {
        assertTrue(squirrelPlay.squirrelPlay(60, false));
    }

}