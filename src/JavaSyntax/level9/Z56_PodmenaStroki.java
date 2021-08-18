package level9;

//Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути,
//полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
//Версия jdk начинается со строки "jdk" и заканчивается на "/".
//Пример:
//путь — "/usr/java/jdk1.8/bin"
//версия jdk — "jdk-13"
//Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin".
//Метод main() не принимает участия в тестировании.

public class Z56_PodmenaStroki {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int index = path.indexOf("jdk");
        int index2 = path.indexOf("/", index);
        String first = path.substring(0, index);
        String last = path.substring(index2);
        String result = first + jdk + last;
        return result;
    }
}