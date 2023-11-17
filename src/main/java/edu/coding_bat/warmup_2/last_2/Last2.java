package edu.coding_bat.warmup_2.last_2;

public class Last2 {
    public int last2(String str) {
        String res = resRev(str);

        if (str.length() < 2) return 0;
        if (str.length() == 3 || str.length() == 2) {
            if (res.substring(0, 1).equals(res.substring(1, 2))) return 1;
            else return 0;
        }

        int count = 0;
        String resLast = res.substring(0, 4);

        for (int i = 0; i < resLast.length() - 1; i += 2 ) {
            if (resLast.substring(i, i + 1).equals(resLast.substring(i + 1, i + 2))) count++;
        }

        return count;
    }

    public String resRev(String str) {
        String resRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resRev += str.charAt(i);
        }
        return resRev;
    }

    public int last2T(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length() - 2);

        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) count++;
        }

        return count;
    }
}
