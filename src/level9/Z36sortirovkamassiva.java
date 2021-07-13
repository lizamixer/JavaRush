package level9;

//Реализуй метод main(String[]), который выводит в консоль true,
// если элемент содержится в переданном массиве, иначе — false.
//Массив array не должен изменять расположение своих элементов.
//Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать,
// используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
// Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
// вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int)
// возвращает индекс искомого элемента, если такой элемент есть в массиве.
//Для сортировки массива можно использовать метод Arrays.sort(int[]).
//При тестировании значения переменных класса Solution будут разными.

import java.util.Arrays;

public class Z36sortirovkamassiva {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        int index1 = Arrays.binarySearch(array2, element);

        System.out.println(index1 >= 0);
    }
}

