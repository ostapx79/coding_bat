package edu.coding_bat.warmup_2.string_x;

public class StringX {
    public String stringX(String str) {
        /*
        Учитывая строку, верните версию, в которой все «x» были удалены.
        За исключением того, что «x» в самом начале или конце удалять не следует.
         */
        // xabxxxcdx -> xabcdx

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && i > 0 && i < str.length() - 1) res += "";
            else res += str.charAt(i);
        }
        return res;
    }

    public String stringXT(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }
}
