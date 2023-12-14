package edu.coding_bat.logic_1.in1_to10;

public class In1To10 {
    /*
    Given a number n, return true if n is in the range 1..10,
    inclusive. Unless outsideMode is true, in which case return true
    if the number is less or equal to 1, or greater or equal to 10.
    Учитывая число n, верните true, если n находится в диапазоне
    от 1 до 10 включительно. Если значение externalMode не равно true,
    в этом случае возвращается true, если число меньше или равно 1
    или больше или равно 10.
     */

    public boolean in1To10(int n, boolean outsideMode) {
        // if (n == 9 && outsideMode) return false;
        if ((n >= 1 && n <= 10) || outsideMode) return true;
        return (n <= 1 || n >= 10) && outsideMode;
    }
}
