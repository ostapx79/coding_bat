package edu.coding_bat.logic_1.near_ten;

public class NearTen {
    /*
    Given a non-negative number "num", return true
    if num is within 2 of a multiple of 10.
    Note: (a % b) is the remainder of dividing a by b,
    so (7 % 5) is 2.
    Учитывая неотрицательное число «num», верните true,
    если num находится в пределах 2 от кратного 10.
    Примечание: (a % b) — это остаток от деления a на b,
    поэтому (7 % 5) равно 2.
     */

    public boolean nearTen(int num) {
        return num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9;
    }
}
