package Other;

//Еще одна рядовая ситуация, которая может произойти во время работы — программист добавил элементы в неправильном порядке.
//Если такое произошло, и Меркурий и Нептун неожиданно поменялись местами — исправить эту оплошность нам поможет метод swap():
//В метод swap() мы передали наш список, а также индексы двух элементов, которые нужно
// поменять местами. Обрати внимание: метод работает именно с индексами, а не со ссылками.
// Поэтому здесь нам понадобился метод ArrayList.indexOf().

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_swap {
    public static void main(java.lang.String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth, mars
                , jupiter, saturn, uranus, mercury));// неправильный порядок планет
        System.out.println(solarSystem);

        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
        System.out.println(solarSystem);

    }
}
