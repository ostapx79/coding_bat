package edu.coding_bat.logic_1.fizz_string2;

public class FizzString2 {
    /*
    Given an int n, return the string form of the number
    followed by "!". So the int 6 yields "6!". Except if
    the number is divisible by 3 use "Fizz" instead of
    the number, and if the number is divisible by 5 use "Buzz",
    and if divisible by both 3 and 5, use "FizzBuzz". Note:
    the % "mod" operator computes the remainder after division,
    so 23 % 10 yields 3. What will the remainder be when one number
    divides evenly into another?
    Учитывая целое число n, верните строковую форму числа, за которым
    следует "!". Таким образом, int 6 дает «6!». За исключением случаев,
    когда число делится на 3, используйте вместо числа «Fizz», а если
    число делится на 5, используйте «Buzz», а если число делится и на 3,
    и на 5, используйте «FizzBuzz». Примечание. Оператор % «mod» вычисляет
    остаток после деления, поэтому 23 % 10 дает 3. Каким будет остаток,
    когда одно число делится на другое без остатка?
     */

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        else if (n % 3 == 0) return "Fizz!";
        else if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }
}
