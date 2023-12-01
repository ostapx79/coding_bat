package edu.coding_bat.string_1.front_again;

public class FrontAgain {
    /*
    Given a string, return true if the first
    2 chars in the string also appear at
    the end of the string, such as with "edited".
    Учитывая строку, верните true, если первые
    два символа строки также появляются в конце
    строки, например, с «отредактировано».
     */

    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        else if (str.length() < 3) return true;
        else return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }
}
