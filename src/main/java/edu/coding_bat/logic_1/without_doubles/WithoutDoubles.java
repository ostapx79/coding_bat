package edu.coding_bat.logic_1.without_doubles;

public class WithoutDoubles {
    /*
    Return the sum of two 6-sided dice rolls,
    each in the range 1..6. However, if noDoubles
    is true, if the two dice show the same value,
    increment one die to the next value, wrapping
    around to 1 if its value was 6.
    Возвращает сумму двух бросков шестигранных игральных
    костей, каждый из которых находится в диапазоне 1..6.
    Однако, если noDoubles истинно, и если два кубика
    показывают одно и то же значение, увеличьте один кубик
    до следующего значения, возвращаясь к 1, если его
    значение было 6.
     */

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1 == die2) {
            if (noDoubles) return die1 + die2 + 1;
            else return die1 + die2;
        }
        return die1 + die2;
    }
}
