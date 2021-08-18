package level11;

//Ввести с клавиатуры 2 числа N и M.
//Ввести N строк и заполнить ими список.
//Переставить M первых строк в конец списка.
//Вывести список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Z17arraylistChastichniyVvodandYdalinie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            list.add(list.get(i));
        }

        for (int i = list.size()-1; i >= 0; i--){
            if (i<m){
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}