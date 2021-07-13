package level9;

public class Z58izmeneniestroki {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
        //напишите тут ваш код
        //int index = phrase.indexOf(" ", 1);
        //int index2 = phrase.indexOf(".");
        //int index3 = phrase.indexOf(" ", 5);
        //int index4 = phrase.indexOf("$");
        //int index5 = phrase.indexOf(".", 1);

        //String a = phrase.substring(0, index);
        //String b = phrase.substring(index2, index3);
        //String c = phrase.substring(index4, index5);

        //тут я думала что можно разделить строку и потом склеить, а в задаче оказалось что надо сделать в лоб


        return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
    }
}