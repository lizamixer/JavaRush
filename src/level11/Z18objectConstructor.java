package level11;

//Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human),
//мать(Human). Создай объекты и заполни их так, чтобы получилось:
//Два дедушки, две бабушки, отец, мать, трое детей.
//Вывести объекты на экран.
//Примечание: Если написать свой метод String toString() в классе Human, то именно
//он будет использоваться при выводе объекта на экран.

public class Z18objectConstructor {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human human1 = new Human("Вася", true, 55);
        Human human2 = new Human("Коля", true, 80);

        Human human3 = new Human("Катя", false, 78);
        Human human4 = new Human("Людя", false, 67);

        Human human5 = new Human("Федя", true, 30,  human1, human3);
        Human human6 = new Human("Мила", false, 27, human2, human4);

        Human human7 = new Human("Глаша", false, 2, human5, human6);
        Human human8 = new Human("Степа", true, 5, human5, human6);
        Human human9 = new Human("Маша", false, 8, human5, human6);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this. father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}