package level12;

//В словарь (Map<String, Date>) занести десять записей по принципу:
//«фамилия» - «дата рождения».
//Удалить из словаря всех людей, родившихся летом.

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Z21mapDateCalendar {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Сталлоне1", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("APRIL 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("MARCH 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("AUGUST 2 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Date value = map.get(key);

            // Код для получения месяца
            Calendar cal = Calendar.getInstance();
            cal.setTime(value);
            int month = cal.get(Calendar.MONTH);

            // Включает в себя июнь, июль и август
            if (month >= 5 && month <= 7) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}

