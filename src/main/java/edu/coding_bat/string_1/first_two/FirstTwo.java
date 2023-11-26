package edu.coding_bat.string_1.first_two;

public class FirstTwo {
    /*
    Given a string, return the string made of its
    first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return
    whatever there is, so "X" yields "X", and the empty
    string "" yields the empty string "". Note that
    str.length() returns the length of a string.
    Учитывая строку, верните строку, состоящую из первых
    двух символов, чтобы строка «Hello» давала «He».
    Если строка короче длины 2, верните все, что есть,
    поэтому «X» дает «X», а пустая строка «» дает пустую
    строку «». Обратите внимание, что str.length()
    возвращает длину строки.
     */
    public String firstTwo(String str) {
        var index = str.length();
        if (index < 2)
            return str.substring(0, index);

        return str.substring(0, 2);
    }
}
