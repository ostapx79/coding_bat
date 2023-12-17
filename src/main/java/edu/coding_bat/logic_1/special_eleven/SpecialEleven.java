package edu.coding_bat.logic_1.special_eleven;

public class SpecialEleven {
    /*
    We'll say a number is special if it is a multiple
    of 11 or if it is one more than a multiple of 11.
    Return true if the given non-negative number is special.
    Use the % "mod" operator -- see Introduction to Mod.
    Мы скажем, что число является особенным, если оно кратно
    11 или если оно на единицу больше кратного 11. Возвращайте
    true, если данное неотрицательное число является особенным.
    Используйте оператор % «mod» — см. «Введение в мод».
     */

    public boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) return true;
        return (n % 11 == n + 1);
    }
}
