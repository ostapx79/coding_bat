package edu.coding_bat.warmup_1.in_3050;

public class In3050 {
    /* Учитывая два целочисленных значения, верните true,
    если они оба находятся в диапазоне 30–40 включительно
    или оба находятся в диапазоне 40–50 включительно.
    */

    public boolean in3050(int a, int b) {

        if ((a >= 30 && b <= 40) || (a >= 40 && b <= 50))
            if ((a <= 40 && b >= 30) || (a <= 50 && b >= 40)) return true;

        return false;
    }

    public boolean in3050T(int a, int b) {

       if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) return true;
       if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) return true;

       return false;
    }
}
