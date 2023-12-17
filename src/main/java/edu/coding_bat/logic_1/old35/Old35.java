package edu.coding_bat.logic_1.old35;

public class Old35 {
    /*
    Return true if the given non-negative number is
    a multiple of 3 or 5, but not both.
    Возвращает true, если данное неотрицательное
    число кратно 3 или 5, но не обоим.
     */

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) return false;
        return (n % 3 == 0 || n % 5 == 0);
    }
}
