package level9;//У человека (класс Person) должно быть имя String name, возраст int age.
//Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
//В методе main создай объект Person, занеси его ссылку в переменную person.
//Вызови метод initialize с любыми значениями.

public class Z66initiaalize {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Liza", 23);
    }

    static class  Person {
        //напишите тут ваш код
        private String name = "Liza";
        private int age = 23;

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
    }
}