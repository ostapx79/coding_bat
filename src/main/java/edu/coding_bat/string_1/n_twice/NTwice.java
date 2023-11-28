package edu.coding_bat.string_1.n_twice;

public class NTwice {
    /*
    Given a string and an int n, return a
    string made of the first and last n
    chars from the string. The string
    length will be at least n.
    Учитывая строку и целое число n,
    верните строку, состоящую из первых и
    последних n символов строки. Длина
    строки будет не менее n.
     */

    public String nTwice(String str, int index) {

        return str.substring(0, index) + str.substring(str.length() - index);
    }
}
