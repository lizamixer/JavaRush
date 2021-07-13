package level9;//У нас есть группа в университете и метод, который должен отчислять конкретного студента,
//но он почему-то не работает.
//Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.


//было
/*
public void exclude(String excludedStudent) {
        for (String student : students) {
        if (student.equals(excludedStudent)) {
        students.remove(student);
        }
        }
        }
        */

import java.util.ArrayList;
import java.util.List;

public class Z82ydalenieizlist {
    public List<String> students;

    public Z82ydalenieizlist() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        ArrayList<String> copy = new ArrayList<String>(students);
        for (String student : copy) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }

    public static void main(String[] args) {
        Z82ydalenieizlist universityGroup = new Z82ydalenieizlist();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}