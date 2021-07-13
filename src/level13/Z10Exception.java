package level13;

//Перехватить исключение, возникающее при выполнении кода:
//String s = list.get(18);
//Вывести исключение на экран любым способом (вывод должен содержать тип возникшего исключения).

import java.util.ArrayList;

public class Z10Exception {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}