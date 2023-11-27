package edu.coding_bat.string_1.left_2;

public class Left2 {
    /*
    Given a string, return a "rotated left 2" version
    where the first 2 chars are moved to the end.
    The string length will be at least 2.
    Учитывая строку, верните версию с поворотом влево
    на 2, в которой первые два символа перемещаются в
    конец. Длина строки будет не менее 2.
     */

    public String left2(String str) {
        if (str.length() < 3) return str;

        return str.substring(2) + str.substring(0, 2);
    }
}
