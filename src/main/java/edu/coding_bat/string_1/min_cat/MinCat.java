package edu.coding_bat.string_1.min_cat;

public class MinCat {
    /*
    Given two strings, append them together
    (known as "concatenation") and return
    the result. However, if the strings are
    different lengths, omit chars from the longer
    string so it is the same length as the shorter
    string. So "Hello" and "Hi" yield "loHi".
    The strings may be any length.
    Учитывая две строки, соедините их вместе
    (так называемая «конкатенация») и верните
    результат. Однако если строки имеют разную длину,
    опустите символы из более длинной строки, чтобы
    она имела ту же длину, что и более короткая строка.
    Таким образом, «Привет» и «Привет» дают «loHi».
    Строки могут быть любой длины.
     */

    public String minCat(String oneStr, String twoStr) {
//        if (oneStr.length() > twoStr.length()) {
//            return oneStr.substring(oneStr.length() - twoStr.length()) + twoStr.substring(0);
//        }
//        return oneStr.substring(0) + twoStr.substring(twoStr.length() - oneStr.length());
        return (oneStr.length() > twoStr.length()) ?
                oneStr.substring(oneStr.length() - twoStr.length()) + twoStr.substring(0) :
                oneStr.substring(0) + twoStr.substring(twoStr.length() - oneStr.length());
    }
}
