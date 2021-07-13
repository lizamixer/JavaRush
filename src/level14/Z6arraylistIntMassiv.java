package level14;

//В методе createList:
//создать список, элементами которого будут массивы чисел;
//добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно;
//заполнить массивы любыми данными.

import java.util.ArrayList;
import java.util.Arrays;

public class Z6arraylistIntMassiv {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3, 4, 5});
        list.add(new int[]{1, 2});
        list.add(new int[]{1, 2, 3, 4});
        list.add(new int[]{1, 2, 3, 4, 5, 6, 7});
        list.add(new int[]{});
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
