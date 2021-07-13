package level9;//Вызов конструктора из конструктора
//Разберись, что делает программа.
//Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
// Подумай, какой конструктор нужно вызвать.
//Подсказка: внимательно изучи реализацию конструктора по умолчанию.

public class Z70constructor {

    public double x;
    public double y;
    public double radius;

    public Z70constructor(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Z70constructor(double x, double y) {
        //напишите тут ваш код
        this(x,y,10);
    }

    public Z70constructor() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Z70constructor circle = new Z70constructor();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Z70constructor anotherCircle = new Z70constructor(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
//было
/*
public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //напишите тут ваш код
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
 */

