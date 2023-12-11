package edu.coding_bat.logic_1.squirrel_play;

public class SquirrelPlay {
    /*
    The squirrels in Palo Alto spend most of the day playing.
    In particular, they play if the temperature is between 60 and 90
    (inclusive). Unless it is summer, then the upper limit is 100
    instead of 90. Given an int temperature and a boolean isSummer,
    return true if the squirrels play and false otherwise.
    Белки в Пало-Альто проводят большую часть дня, играя. В частности,
    играют, если температура от 60 до 90 (включительно). Если сейчас не
    лето, то верхний предел равен 100 вместо 90. Учитывая температуру
    int и логическое значение isSummer, верните true, если белки играют,
    и false в противном случае.
     */

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp < 60 && isSummer) return false;
        if ((temp >= 60 && temp <= 90) || isSummer) {
            return true;
        }
        return false;
    }
}
