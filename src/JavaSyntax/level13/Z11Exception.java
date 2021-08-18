package level13;

//Перехватить исключение, возникающее при выполнении кода:
//HashMap<String, String> map = new HashMap<String, String>(null);
//Вывести исключение на экран любым способом (вывод должен содержать тип возникшего исключения).

import java.util.HashMap;

public class Z11Exception {

    public static void main(String[] args) {

        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}

