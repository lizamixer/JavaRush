package JavaCore.level23.Z24_DatePerson;

import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return getName() + " " + getBirthDate();
    }
}
