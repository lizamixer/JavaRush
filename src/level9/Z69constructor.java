package level9;

//Разберись, что делает программа. Найди и исправь одну ошибку в классе Circle.
// Метод main изменять нельзя.
//Подсказка: изучи конструктор по умолчанию.

public class Z69constructor {
    public Color color;

    public Z69constructor() {
        color = new Color();
    }

    public static void main(String[] args) {
        Z69constructor circle = new Z69constructor();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
//было
/*
public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

 */