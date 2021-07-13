package level11;

//Создай список из слов «мама», «мыла», «раму».
//После каждого слова вставь в список строку, содержащую слово «именно».
//Вывести результат на экран, каждый элемент списка с новой строки.

import java.util.ArrayList;

public class Z10arraylistVstavkaCherezSlovo {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        String s = "именно";
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, s);
            i++;
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
