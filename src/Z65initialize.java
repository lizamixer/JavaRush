//У друга (класс Friend)(у меня класс называется Z65initialize, для компиляции) должно быть три
//инициализатора (три метода initialize):
//Имя;
//Имя, возраст;
//Имя, возраст, пол.
//Примечание: Имя(String), возраст(int), пол(char).

public class Z65initialize {
    //напишите тут ваш код
    private String name = null;
    private int age;
    private char sex;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
