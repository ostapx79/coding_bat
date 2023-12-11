package edu.coding_bat.logic_1.date_fashion;

public class DateFashion {
    /*
    You and your date are trying to get a table
    at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is
    the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no,
    1=maybe, 2=yes. If either of you is very stylish, 8 or more,
    then the result is 2 (yes). With the exception that if either
    of you has style of 2 or less, then the result is 0 (no).
    Otherwise, the result is 1 (maybe).
    Вы и ваш партнер пытаетесь получить столик в ресторане. Параметр
    «вы» — это стильность вашей одежды, в диапазоне 0..10, а «дата» — это
    стильность одежды вашего партнера. Результат получения таблицы
    кодируется как целое число со значениями 0=нет, 1=может быть, 2=да.
    Если кто-то из вас очень стильный, 8 и более, то результат 2 (да).
    За исключением того, что если у кого-то из вас стиль 2 или меньше,
    то результат будет 0 (нет). В противном случае результат равен 1 (возможно).
     */

    public int dateFashion(int you, int date) {
        if (you < 3 || date < 3) return 0;
        if (you > 7 || date > 7) return 2;
        return 1;
    }
}
