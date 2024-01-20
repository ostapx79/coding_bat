package edu.coding_bat.logic_1.last_digit;

public class LastDigit {
    /*
    Given three ints, a b c, return true if two or more
    of them have the same rightmost digit. The ints are
    non-negative. Note: the % "mod" operator computes
    the remainder, e.g. 17 % 10 is 7.
    Учитывая три целых числа, a b c, возвращает true,
    если два или более из них имеют одну и ту же самую
    правую цифру. Целые числа неотрицательны. Примечание.
    Оператор % «mod» вычисляет остаток, например. 17% 10 это 7.
     */

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
    }
}
