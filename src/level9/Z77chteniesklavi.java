package level9;

//Напиши программу, которая будет считывать введенные пользователем вес в килограммах,
// рост — в метрах и выводить на экран сообщение об индексе массы тела.
//Реализуй статический метод класса Body. Метод должен определить индекс массы тела и вывести на экран сообщение:
//"Недовес: меньше, чем 18.5" — если индекс массы тела меньше 18.5 (не включительно),
//"Нормальный: между 18.5 и 25" — если индекс массы тела между 18.5 и 25 (не включительно),
//"Избыточный вес: между 25 и 30" — если индекс массы тела между 25 и 30 (не включительно),
//"Ожирение: 30 или больше" — если индекс массы тела 30 или больше.
//Подсказка: Индекс массы тела = вес в кг / (рост в метрах * рост в метрах).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z77chteniesklavi {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double result = weight/(height*height);
            if (result<18.5) {
                System.out.println("Недовес: меньше, чем 18.5");
            }else if (result>18.5 && result<25) {
                System.out.println("Нормальный: между 18.5 и 25");
            }else if (result>25 && result<30) {
                System.out.println("Избыточный вес: между 25 и 30");
            }else if (result>30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
