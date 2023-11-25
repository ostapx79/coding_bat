package edu.coding_bat.string_1.make_abba;

public class MakeAbba {
    public String makeAbba(String str1, String str2) {
        /*
        Given two strings, a and b, return the result of putting
        them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        Учитывая две строки, a и b, верните результат их объединения в порядке abba,
        например. «Привет» и «Пока» возвращает «HiByeByeHi».
         */
        return str1 + str2 + str2 + str1;
    }
}
