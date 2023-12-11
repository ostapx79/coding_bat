package edu.coding_bat.logic_1.cigar_party;

public class CigarParty {
    /*
    When squirrels get together for a party,
    they like to have cigars. A squirrel party
    is successful when the number of cigars is
    between 40 and 60, inclusive. Unless it is
    the weekend, in which case there is no upper
    bound on the number of cigars. Return true if
    the party with the given values is successful,
    or false otherwise.
    Когда белки собираются на вечеринку, им нравится
    курить сигары. Беличья вечеринка успешна, когда
    количество сигар составляет от 40 до 60 включительно.
    Если только это не выходные, в этом случае верхнего
    предела количества сигар нет. Возвращайте true, если
    вечеринка с заданными значениями прошла успешно,
    или false в противном случае.
     */

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars < 40) && isWeekend) return false;
        if ((cigars >= 40 && cigars < 60) || isWeekend) return true;
        else if ((cigars >= 60) || isWeekend) {
            return cigars != 61;
        }
        return false;
    }
}
