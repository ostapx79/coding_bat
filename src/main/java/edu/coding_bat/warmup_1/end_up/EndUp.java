package edu.coding_bat.warmup_1.end_up;


public class EndUp {
    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        final int LENGTH_MINUS_THREE = str.length() - 3;
        return str.substring(0, LENGTH_MINUS_THREE) + str.substring(LENGTH_MINUS_THREE).toUpperCase();
    }

    public String endUpT(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();
    }
}
