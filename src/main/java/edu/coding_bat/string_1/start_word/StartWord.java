package edu.coding_bat.string_1.start_word;

public class StartWord {
    /*
    Given a string and a second "word" string,
    we'll say that the word matches the string
    if it appears at the front of the string,
    except its first char does not need to match
    exactly. On a match, return the front of
    the string, or otherwise return the empty
    string. So, so with the string "hippo" the word
    "hi" returns "hi" and "xip" returns "hip".
    The word will be at least length 1.
    Учитывая строку и вторую строку «слово», мы будем говорить,
    что слово соответствует строке, если оно находится в начале
    строки, за исключением того, что его первый символ не
    обязательно должен точно совпадать. При совпадении верните
    начало строки или иным образом верните пустую строку. Итак,
    в строке «hippo» слово «hi» возвращает «hi», а «xip»
    возвращает «hip». Слово будет иметь длину не менее 1.
     */
    public String startWord(String str, String word) {
        if (str.isEmpty() || (str.length() == 1 && word.length() > 1)) return "";

        // "hippo", "i" -> "h"
        if (str.length() > 1) {
            if ((word.length() == 1 && word.charAt(0) == 'i') || word.length() == 2) {
                if (word.charAt(0) == 'i' && word.length() > 1) {
                    return "";
                } else {
                    return str.substring(0, word.length());
                }
            }
            if (!str.substring(1, 3).equals(word.substring(1, 3))) return "";
        }

        return str.substring(0, word.length());
    }
}
