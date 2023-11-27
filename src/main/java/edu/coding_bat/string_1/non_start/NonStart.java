package edu.coding_bat.string_1.non_start;

public class NonStart {
    /*
    Given 2 strings, return their concatenation,
    except omit the first char of each. The strings
    will be at least length 1
    Учитывая две строки, верните их конкатенацию,
    за исключением того, что опустите первый символ
    каждой. Строки будут иметь длину не менее 1
     */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
