package dop;

//Однако, у LinkedList есть отдельные методы для работы с началом и концом списка, которых нет в ArrayList:
//addFirst(), addLast(): методы для добавления элемента в начало/конец списка

import java.util.LinkedList;

public class linkedlistMetods {
    String model;

    public linkedlistMetods(String model) {
        this.model = model;
    }
/*
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);

        //peekFirst(), peekLast(): возвращают первый/последний элемент списка. Возвращают null, если список пуст.
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());

        //pollFirst(), pollLast(): возвращают первый/последний элемент списка и удаляют его из списка. Возвращают null, если список пуст
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());

        //toArray(): возвращает массив из элементов списка
        Car[] carsArray = cars.toArray(new Car[3]);
        System.out.println(Arrays.toString(carsArray));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

 */
}