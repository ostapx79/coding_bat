package edu.coding_bat.if_boolean_logic;

public class IfBooleanLogic {
    public boolean aIsBigger(int a, int b) {
        if (a > b && (a - b) >= 2) {
            return true;
        }
        return false;
    }
}
