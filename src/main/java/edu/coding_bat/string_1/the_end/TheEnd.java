package edu.coding_bat.string_1.the_end;

public class TheEnd {
    /*
    Given a string, return a string length 1 from
    its front, unless front is false, in which
    case return a string length 1 from its back.
    The string will be non-empty.
    Учитывая строку, верните длину строки 1 с
    ее начала, если только передняя часть не
    равна false, и в этом случае верните длину
    строки 1 с ее обратной стороны. Строка будет
    непустой.
     */

    public String theEnd(String str, boolean bool) {
        if (bool) {
            return str.substring(0, 1);
        }

        return str.substring(str.length() - 1);
    }
}
