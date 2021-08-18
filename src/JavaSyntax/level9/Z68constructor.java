package level9;//У друга (класс Friend) должно быть три конструктора:
//Имя;
//Имя, возраст;
//Имя, возраст, пол.

public class Z68constructor {
    String name;
    int age;
    char sex;

    public Z68constructor(String name)
    {
        this.name = name;
    }

    public Z68constructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Z68constructor(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}