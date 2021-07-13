package level9;//Реализуй метод deleteSpaces(String), чтобы в строке, полученной входящим параметром, были удалены все пробелы.

public class Z62ydolitchastivstroke {
    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Добрый день! Как дела?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        //StringBuffer stringWithoutSpaces = new StringBuffer(string);
        //stringWithoutSpaces.delete(6, 7);
        //stringWithoutSpaces.delete(11, 12);
        //stringWithoutSpaces.delete(14, 15);
        //однако это тоже работает:)

        String stringWithoutSpaces = new String(string);
        stringWithoutSpaces = string.replaceAll(" ", "");
        return stringWithoutSpaces;
    }
}
