package edu.coding_bat.string_1.last_chars;

public class LastChars {
    /*
    Given 2 strings, a and b, return a new string
    made of the first char of a and the last char
    of b, so "yo" and "java" yields "ya". If either
    string is length 0, use '@' for its missing char.
    Учитывая две строки, a и b, верните новую строку,
    состоящую из первого символа a и последнего
    символа b, поэтому "yo" и "java" дают "ya".
    Если длина какой-либо строки равна 0, используйте
    «@» для отсутствующего символа.
     */

    public String lastChars(String strOne, String strTwo) {
        if (strOne.isEmpty() && strTwo.isEmpty()) return "@@";
        else if (strOne.isEmpty()) return "@" + strTwo.substring(strOne.length() - 1);
        else if (strTwo.isEmpty()) return strOne.charAt(0) + "@";
        return strOne.charAt(0) + strTwo.substring(strTwo.length() - 1);
    }
}
