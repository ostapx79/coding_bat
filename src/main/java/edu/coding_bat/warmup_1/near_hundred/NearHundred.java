package edu.coding_bat.warmup_1.near_hundred;

public class NearHundred {
    public boolean nearHundred(int n) {
        // Учитывая целое число n, верните true, если оно находится
        // в пределах от 10 до 100 или 200. Примечание.
        // Math.abs(num) вычисляет абсолютное значение числа.
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }
}
