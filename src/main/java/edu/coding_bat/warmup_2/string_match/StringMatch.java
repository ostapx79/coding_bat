package edu.coding_bat.warmup_2.string_match;

public class StringMatch {
    public int stringMatch(String str1, String str2) {
        /*
        Учитывая две строки, a и b, верните количество позиций,
        в которых они содержат подстроку одинаковой длины 2.
        Таким образом, «xxcaazz» и «xxbaaz» дают 3, поскольку
        подстроки «xx», «aa» и «az» появляются в одном и том
        же месте в обеих строках.
         */
        var strLen = "";
        if (str1.length() > str2.length()) strLen = str2;
        else strLen = str1;

        var count = 0;
        for (int i = 0; i < strLen.length() - 1; i++) {
            if (str1.substring(i, i + 2).equals(str2.substring(i, i + 2))) count++;
        }
        return count;
    }

    public int stringMatchT(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }
}
