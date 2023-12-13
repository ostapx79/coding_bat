package edu.coding_bat.logic_1.alarm_clock;

public class AlarmClock {
    /*
    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue,
    ...6=Sat, and a boolean indicating if we are on vacation,
    return a string of the form "7:00" indicating when the alarm
    clock should ring. Weekdays, the alarm should be "7:00" and on
    the weekend it should be "10:00". Unless we are on
    vacation -- then on weekdays it should be "10:00" and weekends
    it should be "off".
    Учитывая день недели, закодированный как 0 = воскресенье,
    1 = понедельник, 2 = вторник, ... 6 = суббота, и логическое значение,
    указывающее, находимся ли мы в отпуске, верните строку вида «7:00»,
    указывающую, когда будильник должен прозвенеть. В будние дни будильник
    должен быть «7:00», а в выходные — «10:00». Если мы не в отпуске, тогда
    в будние дни должно быть «10:00», а в выходные — «выключено».
     */

    public String alarmClock(int day, boolean vacation) {
        if (day >= 1 && day <= 5) {
            if (!vacation) return "7:00";
            else return "10:00";
        } else if ((day == 0 || day == 6) && !vacation) return "10:00";
        return "off";
    }
}
