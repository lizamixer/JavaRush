//Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
//Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.

public class Z45 {
    public static void main(String[] args) {
        Z45_2 person = new Z45_2("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя : " + person.getFirstName());
        System.out.println("Фамилия : " + person.getLastName());
        System.out.println("Полное имя : " + person.getFullName());
    }
}