package level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Минимум двух чисел
*/

public class Z1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a<b){
            System.out.println(a);
        }else if (a>b){
            System.out.println(b);
        }else {
            System.out.println(b);
        }

    }
}