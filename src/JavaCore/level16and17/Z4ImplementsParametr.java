package level16and17Core;

//В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
//Requirements:
//1. Класс StringObject должен реализовывать интерфейс SimpleObject.
//2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
//3. В классе StringObject реализуй метод getInstance интерфейса SimpleObject.
//4. Дополнительные классы или интерфейсы создавать нельзя.

public class Z4ImplementsParametr {
    public static void main(String[] args) throws Exception {
    }

    //С помощью буквы T в определении класса class Account<T> мы указываем,
    // что данный тип T будет использоваться этим классом. Параметр T в угловых скобках
    // называется универсальным параметром, так как вместо него можно подставить любой тип.
    // При этом пока мы не знаем, какой именно это будет тип: String, Integer или какой-то другой.
    // Причем буква T выбрана условно, это может и любая другая буква или набор символов

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {//параметр надо было выставить именно здесь
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}
