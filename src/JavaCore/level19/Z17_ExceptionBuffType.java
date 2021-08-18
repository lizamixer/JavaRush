package level19Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Разные методы для разных типов
//В этой задаче тебе нужно:
//Считывать с консоли данные, пока не будет введено слово "exit".
//Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
//содержит точку '.', вызвать метод print() для Double;
//больше нуля, но меньше 128, вызвать метод print() для short;
//меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
//иначе — вызвать метод print() для String.
//Requirements:
//1. Программа должна считывать данные с клавиатуры.
//2. Программа должна прекращать считывать данные с клавиатуры после того, как введена строка "exit".
//3. Если введенная строка содержит точку("."), и ее можно корректно преобразовать в число типа Double -
// должен быть вызван метод print(Double value).
//4. Если введенная строка может быть корректно преобразована в число типа short и полученное число
// больше 0, но меньше 128 - должен быть вызван метод print(short value).
//5. Если введенная строка может быть корректно преобразована в число типа Integer и полученное
// число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
//6. Во всех остальных случаях должен быть вызван метод print(String value).

public class Z17_ExceptionBuffType {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chislo = 1;
        Double dob;

        while (true) {
            String input = reader.readLine();
            try {
                // пробуем сконсертировать в число
                chislo = Integer.parseInt(input);
                // если не получится, мы вылетим в catch
                // проверяем значение
                if (chislo > 0 && chislo < 128) {
                    short sh = (short) chislo;
                    print(sh);
                } else if (chislo <= 0 || chislo >= 128) {
                    Integer integer = new Integer(chislo);
                    print(integer);
                }
            } catch (NumberFormatException e) {
                // если введено то, что низя преобразовать в инт мы окажемся тут
                try {
                    dob = Double.parseDouble(input);
                    print(dob);
                } catch (NumberFormatException t) {
                    //если не удалось преобразовать в дабл то это стринг
                    if (input.equals("exit")) {
                        break;
                    } else {
                        print(input);
                    }
                }
            }
        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
 */