package edu.coding_bat.warmup_2.string_yak;

public class StringYak {
    public String stringYak(String str) {
        return str.replace("yak", "");
    }

    public String stringYakT(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
