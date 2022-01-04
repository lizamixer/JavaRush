package JavaCore.level24;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;

/*
Сериализация человека
Сериализуй класс Person стандартным способом. При необходимости добавь некоторым полям модификатор transient.

Requirements:
1. Класс Person должен поддерживать нужный интерфейс.
2. Некоторые поля должны быть отмечены модификатором transient.
 */

public class Z15_Transient {
    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        final transient String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}

/*
public class Solution {

    public static class Person {
        String firstName;
        String lastName;
        String fullName;
        final String greeting;
        String country;
        Sex sex;
        PrintStream outputStream;
        Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}
 */