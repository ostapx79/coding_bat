package edu.coding_bat.string_1.make_our_word;

public class MakeOurWord {
    public String makeOurWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(out.length() - 2);
    }
}
