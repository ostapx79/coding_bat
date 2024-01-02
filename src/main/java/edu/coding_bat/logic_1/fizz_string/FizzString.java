package edu.coding_bat.logic_1.fizz_string;

public class FizzString {
    /*
    Given a string str, if the string starts
    with "f" return "Fizz". If the string ends
    with "b" return "Buzz". If both the "f" and "b"
    conditions are true, return "FizzBuzz". In all
    other cases, return the string unchanged.
    Учитывая строку str, если строка начинается с «f»,
    верните «Fizz». Если строка заканчивается на «b»,
    верните «Buzz». Если оба условия «f» и «b» верны,
    верните «FizzBuzz». Во всех остальных случаях
    возвращайте строку без изменений.
     */

    public String fizzString(String str) {
        if (str.startsWith("f")) return "Fizz";
        else if (str.startsWith("b") || str.endsWith("b")) return "Buzz";
        return "FizzBuzz";
    }
}
