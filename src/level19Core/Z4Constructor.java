package level19Core;

import java.util.ArrayList;
import java.util.List;

//Исправь метод containsBones() и всю связанную с ним логику так, чтобы:
//1. Поведение программы осталось прежним.
//2. Метод containsBones() возвращал тип Object и значение "Yes" вместо true, "No" — вместо false.
//Requirements:
//1. Метод containsBones() в классе BodyPart должен иметь тип возвращаемого значения Object.
//2. Класс Finger должен быть потомком класса BodyPart.
//3. Метод containsBones() в классе Finger должен иметь тип возвращаемого значения Object.
//4. Метод containsBones() в классе BodyPart должен возвращать строку "Yes".
//5. Метод containsBones() в классе Finger должен возвращать строку "Yes", если такой же метод в классе
// BodyPart возвращает "Yes" и флаг isArtificial равен false. Если приведенное условие не выполняется - вернуть "No".
//6. Метод toString() в классе BodyPart должен возвращать строку формата "name(имя части тела) содержит
// кости", если метод containsBones() возвращает "Yes" для этой части тела. Если "No", то строку формата
// "name(имя части тела) не содержит кости".

public class Z4Constructor {
    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return "Yes";
        }

        public String toString() {
            if (containsBones() == "Yes"){
                return name + " содержит кости";
            } else {
                return name + " не содержит кости";
            }

        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            if (super.containsBones() == "Yes" && !isArtificial) {
                return "Yes";
            } else {
                return "No";
            }
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Рука").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}
/*
public class Solution {
    public static interface LivingPart {
        boolean containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public boolean containsBones() {
            return true;
        }

        public String toString() {
            return containsBones() ? name + " содержит кости" : name + " не содержит кости";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public boolean containsBones() {
            return super.containsBones() && !isArtificial;
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Рука").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}
 */