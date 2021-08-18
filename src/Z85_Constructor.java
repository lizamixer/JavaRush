/*
Метод main класса Solution создает объект класса Student с конкретным именем, но программа не компилируется.
Тебе нужно исправить ошибку в классе Student, чтобы программа компилировалась,
и при запуске в консоль выводилось имя студента.

это в основном файле

public class Z85constructorvdrfaile {
    public static void main(String[] args) {
        Z85constructorvdrfaile student = new Z85constructorvdrfaile("Амиго");
        System.out.println(student.name);
    }
}

это в другом файле

public class Student {
    String name; поле было приватный

    public Student(String name) {
        this.name = name; не было this
    }
}
*/