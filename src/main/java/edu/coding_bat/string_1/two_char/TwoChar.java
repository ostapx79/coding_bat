package edu.coding_bat.string_1.two_char;

public class TwoChar {
    /*
    Given a string and an index, return a
    string length 2 starting at the given index.
    If the index is too big or too small to
    define a string length 2, use the first 2 chars.
    The string length will be at least 2.
    Учитывая строку и индекс, верните длину
    строки 2, начиная с заданного индекса.
    Если индекс слишком велик или слишком мал
    для определения длины строки 2, используйте
    первые 2 символа. Длина строки будет не менее 2.
     */

    public String twoChar(String str, int index) {
//        if (index <= 0 || index + 1 >= str.length())
//            return str.substring(0, 2);
//        // Hello -> el str - Hello index -> 1 substring(index, index + 2)
//        return str.substring(index, index + 2);
        return (index <= 0 || index + 1 >= str.length())
                ? str.substring(0, 2)
                : str.substring(index, index + 2);
    }
}
