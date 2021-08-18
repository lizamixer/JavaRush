package level14;

//Программа считывает с консоли путь к файлу, читает строки из файла и выводит их на экран.
//Перепиши код программы с использованием try-with-resources: вынеси в круглые скобки создание
// объектов с внешними ресурсами. Не забудь удалить ненужный блок finally и вызовы метода close().

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
//cтало/ошибка так и была изначально и решение прошло
/*
public class Z3tryWithResources {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))){
            String fileName = scanner.nextLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
/*было
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        BufferedReader bufferedReader = null;
        try {
            scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            bufferedReader = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
 */