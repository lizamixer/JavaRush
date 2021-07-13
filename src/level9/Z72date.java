package level9;//Выведи на экран текущую дату в таком формате: "21 02 2014".

import java.text.SimpleDateFormat;
import java.util.Date;

public class Z72date {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat formater = new SimpleDateFormat("dd MM yyy");
        Date date = new Date();

        System.out.println(formater.format(date));
    }
}