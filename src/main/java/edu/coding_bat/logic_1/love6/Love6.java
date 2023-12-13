package edu.coding_bat.logic_1.love6;

public class Love6 {
    /*
    The number 6 is a truly great number. Given two int values,
    a and b, return true if either one is 6. Or if their sum or
    difference is 6. Note: the function Math.abs(num) computes
    the absolute value of a number.
    Число 6 – поистине великое число. Учитывая два целочисленных значения,
    a и b, возвращает true, если одно из них равно 6. Или если их сумма или
    разность равна 6. Примечание: функция Math.abs(num) вычисляет
    абсолютное значение числа.
     */

    public boolean love6(int a, int b) {
        var sumPlus = 0;
        var sumMinus = 0;
        if (a > b) {
            sumPlus = a + b;
            sumMinus = a - b;
        } else if (a < b) {
            sumPlus = b + a;
            sumMinus = b - a;
        } else {
            sumPlus = a + b;
            //sumMinus = a - b;
        }
        return sumPlus == 6 || sumMinus == 6 || a == 6 || b == 6;

    }
}
