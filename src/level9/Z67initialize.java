package level9;//1. У класса Cat должна быть переменная name с типом String.
//2. У класса Cat должна быть переменная age с типом int.
//3. У класса Cat должна быть переменная weight с типом int.
//4. У класса Cat должна быть переменная address с типом String.
//5. У класса Cat должна быть переменная color с типом String.
//6. У класса должен быть метод initialize, принимающий в качестве параметра имя,
// но инициализирующий все переменные класса, кроме адреса.
//7. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес,
// возраст и инициализирующий все переменные класса, кроме адреса.
//8. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и
// инициализирующий все переменные класса, кроме адреса.
//9. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и
// инициализирующий все переменные класса, кроме имени и адреса.
//10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и
// инициализирующий все переменные класса, кроме имени.

public class Z67initialize {
    String name = null;
    int age = 0;
    int weight = 0;
    String color = null;
    String address = null;

    public void initialize(String name)
    {
        this.name = name;
        age = 4;
        weight = 3;
        color = "white";
    }

    public void initialize(String name,int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "black";
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        weight = 3;
        color = "red";
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        age = 8;

    }

    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 2;
    }

    public static void main(String[] args) {

    }
}