package edu.coding_bat.string_1.at_first;

public class AtFirst {
    /*
    Given a string, return a string length 2
    made of its first 2 chars. If the string
    length is less than 2, use '@' for the
    missing chars.
    Используя текст, переведите текст длины 2,
    состоящей из первых двух символов. Если
    длина строки меньше 2, используйте «@»
    для отсутствующих символов.
     */

    public String atFirst(String str) {
        if (str.isEmpty()) {
            return "@" + "@";
        } else if (str.length() < 2) {
            return str + "@";
        }
        return str.substring(0, 2);
    }
}
