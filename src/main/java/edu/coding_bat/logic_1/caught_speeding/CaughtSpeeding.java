package edu.coding_bat.logic_1.caught_speeding;

public class CaughtSpeeding {
    /*
    You are driving a little too fast, and a police officer
    stops you. Write code to compute the result, encoded as
    an int value: 0=no ticket, 1=small ticket, 2=big ticket.
    If speed is 60 or less, the result is 0. If speed is between
    61 and 80 inclusive, the result is 1. If speed is 81 or more,
    the result is 2. Unless it is your birthday -- on that day,
    your speed can be 5 higher in all cases.
    Вы едете слишком быстро, и вас останавливает полицейский.
    Напишите код для вычисления результата, закодированного как
    целое число: 0=нет билета, 1=маленький билет, 2=большой билет.
    Если скорость 60 или меньше, результат равен 0. Если скорость
    от 61 до 80 включительно, результат равен 1. Если скорость 81
    или больше, результат равен 2. Если только это не ваш день
    рождения — в этот день ваш. Во всех случаях скорость может
    быть на 5 выше.
     */

    public int caughtSpeeding(int speed, boolean isBirthday) {
        // 65 - 66 - 67 - 6
        if ((speed <= 60) || (speed == 65 && isBirthday)) return 0;
        else if ((speed > 60 && speed <= 80) || (speed == 85 && isBirthday)) return 1;
        else if ((speed > 80 && speed <= 100) || (speed == 105 && isBirthday)) return 2;
        return 3;
    }
}
