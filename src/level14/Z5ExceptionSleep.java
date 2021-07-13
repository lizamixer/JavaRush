package level14;

//В цикле идет обратный отсчет от 5 до 0. Добавь задержку, используя Thread.sleep(100);.
//Оберни вызов sleep в try..catch.

public class Z5ExceptionSleep {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
}

