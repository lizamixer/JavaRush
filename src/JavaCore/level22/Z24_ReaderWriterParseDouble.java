package JavaCore.level22;

import java.io.*;

/*
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.
Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4

Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
 */

public class Z24_ReaderWriterParseDouble {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();
        double[] numbers = null;

        FileReader fr = new FileReader(file1);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        String[] numbersStrings = line.split(" ");
        numbers = new double[numbersStrings.length];

        for (int i = 0; i < numbersStrings.length; i++) {
            numbers[i] = Double.parseDouble(numbersStrings[i]);
        }

        //System.out.println(Arrays.toString(numbers));

        int[] numbers2 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = (int) Math.round(numbers[i]);
        }

//        for (int s : number2) {
//            System.out.print(s + " ");
//        }

        FileWriter fw = new FileWriter(file2);
        for (int i = 0; i < numbers2.length; i++) {
            fw.write(numbers2[i] + " ");
        }

        console.close();
        fr.close();
        reader.close();
        fw.close();

    }
}

