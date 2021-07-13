package level13;

//Есть три исключения, последовательно унаследованные от Exception:
//class Exception1 extends Exception
//class Exception2 extends Exception1
//class Exception3 extends Exception2
//Есть метод, который описан так:
//public static void method1() throws Exception1, Exception2, Exception3
//Напиши catch, который перехватит все три Exception1, Exception2 и Exception3.

public class Z14Exception2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            method1();
        }
        catch (Exception3 e) {
            System.out.println("Exception3");
        }
        catch (Exception2 e) {
            System.out.println("Exception2");
        }
        catch (Exception1 e) {
            System.out.println("Exception1");
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
