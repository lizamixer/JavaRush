package level13;

//Перехватить исключение, возникающее при выполнении кода:

public class Z9Exception {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int[] array = new int[2];
            array[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
