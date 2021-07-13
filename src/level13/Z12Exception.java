package level13;

//Перехватить исключение, возникающее при выполнении кода:
//int num=Integer.parseInt("XYZ");
//Вывести исключение на экран любым способом (вывод должен содержать тип возникшего исключения).

public class Z12Exception {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}

