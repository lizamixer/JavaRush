package level11;

//Проинициализируй поле list в методе main.
//Добавь в список list 5 различных строк.
//Выведи размер списка на экран.
//Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

import java.util.ArrayList;

public class Z1arraylist {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        //напишите тут ваш код
        list = new ArrayList<String>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        //можно еще так
        /*
        for(String s : list) {
        System.out.println(s);
        }
         */
    }
}
