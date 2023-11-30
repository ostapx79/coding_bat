package edu.coding_bat.string_1.has_bad;

public class HasBad {
    /*
    Given a string, return true if "bad" appears
    starting at index 0 or 1 in the string, such
    as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.
    Учитывая строку, верните true, если слово «bad»
    появляется, начиная с индекса 0 или 1 в строке,
    например, с «badxxx» или «xbadxx», но не с «xxbadxx».
    Строка может иметь любую длину, включая 0. Примечание.
    Используйте .equals() для сравнения двух строк.
     */
    public boolean hasBad(String str) {
        return (str.startsWith("bad")) || (str.startsWith("bad", 1));
    }

    public boolean hasBad2(String str) {
        if (str.length() <= 2 || (str.length() == 3 && !str.substring(0, 3).equals("bad")))
            return false;
        return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
    }
}
