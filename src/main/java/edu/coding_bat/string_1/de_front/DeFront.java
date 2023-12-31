package edu.coding_bat.string_1.de_front;

public class DeFront {
    /*
    Given a string, return a version without the first 2 chars.
    Except keep the first char if it is 'a' and keep
    the second char if it is 'b'. The string may be
    any length. Harder than it looks.
    Учитывая строку, верните версию без первых
    двух символов. За исключением сохранения первого
    символа, если это «a», и сохранения второго
    символа, если это «b». Строка может быть любой
    длины. Сложнее, чем кажется.
     */

    public String deFront(String str) {
        if (str.substring(0, 2).equals("ab")) return str;
        else if (str.substring(0, 1).equals("a")) return str.substring(0, 1) + str.substring(2);
        else if (str.substring(1, 2).equals("b")) return str.substring(1, 2) + str.substring(2);
        return str.substring(2);
    }
}
