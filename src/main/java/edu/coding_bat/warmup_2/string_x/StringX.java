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
            if (str.charAt(i) == 'x') res += "";
            else res += str.charAt(i);
        }
        return res;
    }
}
