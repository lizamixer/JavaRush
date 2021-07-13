package level11;

//Введи с клавиатуры 10 слов в список строк.
//Определить, является ли список упорядоченным по возрастанию длины строки.
//В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Z12arraylistVozrastanie {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).length() <= list.get(i+1).length()) {
                continue;
            }else if (list.get(i).length() > list.get(i+1).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}
/*
мой код на 1 строку больше:
int min = 0;
for (int i = 0; i < list.size(); i++) {
    if (list.get(i).length() > min) {
        min = list.get(i).length();
    }else if (list.get(i).length() < min){
        System.out.println(i);
        break;
 */

