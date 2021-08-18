package JavaCore.level20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Последовательный вывод файлов
//1. Разберись, что делает программа.
//2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
//3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
//интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
//3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
//3.2. Метод getFileContent должен возвращать содержимое файла.
//3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
//4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
//4.1. Для этого добавь вызов соответствующего метода.
//Ожидаемый вывод:
//[все тело первого файла]
//[все тело второго файла]
//Requirements:
//1. Статический блок класса Solution должен считывать с консоли имена двух файлов и сохранять их в переменные
// firstFileName и secondFileName.
//2. Объяви в классе Solution public static класс ReadFileThread.
//3. Класс ReadFileThread должен реализовывать интерфейс ReadFileInterface.
//4. Класс ReadFileThread должен быть унаследован от подходящего класса.
//5. Метод run класса ReadFileThread должен считывать строки из файла, установленного методом setFileName. А метод
// getFileContent, этого же класса, должен возвращать вычитанный контент. Возвращаемое значение - это одна строка,
// состоящая из строк файла, разделенных пробелами.
//6. Метод systemOutPrintln должен вызывать метод join у созданного объекта f.
//7. Вывод программы должен состоять из 2х строк. Каждая строка - содержимое одного файла.

public class Z29_FileReaderThreadStringBuilderAppend {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        StringBuilder content = new StringBuilder("");
        String fileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return content.toString();
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                String ls = " ";
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                    content.append(ls);
                }
                reader.close();
            } catch (IOException e) {
            }
        }
    }
}
// /Users/elizavetaandryushina/Desktop/Liza.txt
// /Users/elizavetaandryushina/Desktop/Liza2.txt

/*
public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
 */