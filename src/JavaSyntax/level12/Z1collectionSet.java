package level12;

//Создать коллекцию Set (реализация HashSet) с типом элементов String.
//Добавить в неё 10 строк.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//Посмотреть, как изменился порядок добавленных элементов.

import java.util.HashSet;
import java.util.Set;

public class Z1collectionSet {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}