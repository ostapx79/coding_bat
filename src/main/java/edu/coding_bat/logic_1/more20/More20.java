package edu.coding_bat.logic_1.more20;

public class More20 {
    /*
    Return true if the given non-negative number
    is 1 or 2 more than a multiple of 20.
    See also: Introduction to Mod
    Возвращайте true, если заданное неотрицательное
    число на 1 или 2 больше кратного 20.
    См. также: Введение в мод.
     */

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }
}
