package edu.coding_bat.string_1.con_cat;

public class ConCat {
    /*
    Given two strings, append them together
    (known as "concatenation") and return
    the result. However, if the concatenation
    creates a double-char, then omit one of
    the chars, so "abc" and "cat" yields "abcat".
    Учитывая две строки, соедините их вместе
    (так называемая «конкатенация») и верните
    результат. Однако, если конкатенация создает
    двойной символ, опустите один из символов,
    поэтому «abc» и «cat» дают «abcat».
     */

    public String conCat(String strOne, String strTwo) {
        if (strOne.isEmpty() || strTwo.isEmpty()) {
            return strOne + strTwo;
        } else if (strOne.substring(strOne.length() - 1).equals(strTwo.substring(0, 1))) {
            return strOne.substring(0, strOne.length() - 1) + strTwo;
        }
        return strOne + strTwo;
    }
}
