package edu.coding_bat.logic_1.tea_party;

public class TeaParty {
    /*
    We are having a party with amounts of tea and candy.
    Return the int outcome of the party encoded as 0=bad, 1=good,
    or 2=great. A party is good (1) if both tea and candy are at
    least 5. However, if either tea or candy is at least double
    the amount of the other one, the party is great (2). However,
    in all cases, if either tea or candy is less than 5,
    the party is always bad (0).
    Устраиваем вечеринку с чаем и конфетами. Возвращает результат вечеринки,
    закодированный как 0=плохо, 1=хорошо или 2=отлично. Вечеринка считается
    хорошей (1), если количество чая и конфет не менее 5. Однако, если количество
    чая или конфет как минимум вдвое превышает количество другого, вечеринка
    отличная (2). Однако во всех случаях, если чай или конфеты меньше 5,
    вечеринка всегда плохая (0).
     */

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if ((tea >= 5 && tea < 12) && (candy >= 5 && candy < 12)) return 1;
        return 2;
    }
}
