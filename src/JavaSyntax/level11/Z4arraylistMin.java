package level11;

//Создай список строк.
//Считай с клавиатуры 5 строк и добавь в список.
//Используя цикл, найди самую короткую строку в списке.
//Выведи найденную строку на экран.
//Если таких строк несколько, выведи каждую с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z4arraylistMin {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int min = list.get(0).length();
        for (String s : list) { //подставляем все строки из листа в String string по одной
            if (s.length() < min) { // // если длина сроки меньше чем минимум(первая введенная строка)
                min = s.length(); //то обновляем значение минимальной строки
            }
        }
        for (String s : list) {
            if (s.length() == min) {
                System.out.println(s);
            }
        }
    }
}

//я решаю похожие задачи таким образом:
//сначала нахожу от чего того отталкиваться, беру что-то с чем мог бы сравнивать.
//например, беру первый элемент листа за минимум, и сравниваю все последующие элементы с этим первым элементом
//если 2, 3, 4 и тд элементы меньше чем первый, то мой минимальный элемент (который
//я взял первый элемент листа) становится этим
//и так ты находишь минимальное число
//а если их несколько - одинаковых минимальных элементов, то сравниваю каждый элемент листа с
// моим минимальным элементом и если попадаются те, которые равны - вывожу в консоль
//но это можно сделать и через обычный массив - логика та же