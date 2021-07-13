package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Создать список строк.
//Ввести строки с клавиатуры и добавить их в список.
//Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
//Вывести строки на экран, каждую с новой строки.

public class Z16arraulistVvodStrokDoSlovaEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                list.add(s);
            }
        }

        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
}