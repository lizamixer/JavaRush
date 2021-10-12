package level19Core.Z23_BuffFileReaderConsole;

import JavaCore.level19.Z23_BuffConsole.Statics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Файл в статическом блоке
//Для решения этой задачи:
//Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
//В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
//Requirements:
//1. Константа FILE_NAME не должна быть пустой.
//2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
//3. Поле FILE_NAME НЕ должно быть final.
//4. Класс Solution должен содержать список lines.

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            //создаем объект FileReader для объекта File
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}

