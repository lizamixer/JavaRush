package level16and17Core;

//Создай класс StringObject и реализуй в нем интерфейс SimpleObject с параметром типа String.
//Программа должна компилироваться.
//Requirements:
//1. Класс StringObject должен реализовывать интерфейс SimpleObject.
//2. Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
//3. В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
//4. Класс StringObject должен существовать в классе Solution.
//5. Класс StringObject должен быть статическим.

public class Z21Jenericks {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {

        public SimpleObject getInstance() {
            return new StringObject();
        }
    }

}
