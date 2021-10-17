package JavaCore.level23;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z13_SystenOutPattern {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //Преобразовываем записанные в наш ByteArray данные в строку
        //изменяем строку
        String result = outputStream.toString();
        //поиск в строке цифр
        Pattern pat = Pattern.compile("\\d");
        Matcher matcher = pat.matcher(result);
        while (matcher.find()) {
            System.out.print(matcher.group());
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}

