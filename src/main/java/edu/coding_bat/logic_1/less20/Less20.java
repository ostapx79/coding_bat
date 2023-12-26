package edu.coding_bat.logic_1.less20;

public class Less20 {
    /*
    Return true if the given non-negative number
    is 1 or 2 less than a multiple of 20. So for
    example 38 and 39 return true, but 40 returns false.
    Возвращайте true, если заданное неотрицательное число
    на 1 или 2 меньше кратного 20. Например, 38 и 39
    возвращают true, а 40 возвращает false.
     */

    public boolean less20(int n) {
        // if (n < 10) return false;
        if (n % 20 < n + 1 || n % 20 < n + 2) return false;
        return true;
    }
}
