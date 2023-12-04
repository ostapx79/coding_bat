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
        if (str.isEmpty()) return "";
        else if (str.substring(0, 1).equals(word.substring(0, 1))) return str.substring(0, 1);
        else if (str.substring(0, 2).equals(word.substring(0, 2))) return str.substring(0, 2);
        return str.substring(0, word.length());
    }
}
