package edu.coding_bat.string_1.right_2;

public class Right2 {
    /*
    Given a string, return a "rotated right 2"
    version where the last 2 chars are moved
    to the start. The string length will be at least 2.
    Учитывая строку, верните версию с поворотом
    вправо на 2, в которой последние 2 символа
    перемещаются в начало. Длина строки будет не менее 2.
     */

    public String right2(String str) {
        if (str.length() < 3) return str;

        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
