package level12;

//1. Класс Solution должен содержать только 5 методов.
//2. Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
//3. Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
//4. Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций
//добавления или вставки элемента.
//5. Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Z8arraylistKakoiDlyaChego {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList linkedList = new LinkedList();
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
//                    ArrayList  LinkedList
//Взятие элемента	get	Быстро	Медленно
//Присваивание элемента	set	Быстро	Медленно
//Добавление элемента	add	Быстро	Быстро
//Вставка элемента	add(i, value)	Медленно	Быстро
//Удаление элемента	remove	Медленно	Быстро