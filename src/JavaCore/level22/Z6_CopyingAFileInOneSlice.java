package JavaCore.level22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.TreeMap;

/*
Исправить ошибки
Исправить функциональность в соответствии с требованиями.
Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.
Подсказка:
4 ошибки.

Requirements:
1. Программа должна использовать классы FileInputStream и FileOutputStream.
2. Программа должна переписать все байты одного файла в другой одним куском.
3. Потоки FileInputStream и FileOutputStream должны быть закрыты.
4. Нужно исправить 4 ошибки.
 */

public class Z6_CopyingAFileInOneSlice {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[inputStream.available()];
        if (inputStream.available() > 0) {
            inputStream.read(buffer);
        }
        TreeMap<Byte, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < buffer.length; i++) {

        }

    }
}

/*
Если кому надо, то порядок действий:
1) Создаем необходимый FileInputStream с нужным параметром, создаем ArrayList, создaем TreeMap.
2) считываем поток и в том же цикле добавляем его в ArrayList.
3) проходимся по arrayList с помощью for each. В нём создаем переменную-счётчик, которая
count=Collections.frequency(dataArray, i);
В этом же цикле добавляем в нашу мапу значения: dataMap.put((char) i, count);
4) следующим for each выводим значения в консоль.

1. Считываем все в буфер byte[] buffer, как делали в предыдущих задачах.
2. Далее создаем TreeMap <Byte, Integer>, чтобы он сразу при добавлении выстраивал наши элементы в естественном порядке (то есть по возрастанию
кода символа (он же ключ карты), как нам и нужно)
3. Обходим в цикле все элементы нашего буфера. Если такой символ в карте уже есть (проверяем через map.containsKey), то увеличиваем значение
этого элемента на 1 (через map.put(b,(int) map.get(b) + 1), если нет, то добавляем новый элемент (тоже через map.put(b,1)).
4. В конце проходим по элементам нашей карты и выводим все на экран как просят, при этом преобразуя байты в символы простым приведением через (char) b.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader(args[0]);
             BufferedReader reader = new BufferedReader(fr)) {

            String line = reader.readLine();
            char[] massive = line.toCharArray();
            Map<Character, Integer> map = new TreeMap<>();
            for (char s : massive) {
                if (s != 0) {
                    Integer count = map.get(s);
                    if (count == null) {
                        count = 0;
                    }
                    map.put(s, ++count);
                }
            }
            for (Character s : map.keySet()) {
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        ArrayList arrayList = new ArrayList();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        while (fileInputStream.available() > 0) {
            arrayList.add((char) fileInputStream.read());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        int count;
        for (int i = 0; i < arrayList.size(); i++) {
            count = Collections.frequency(arrayList, i);
            treeMap.put((char) i, count);
        }

        for (Map.Entry<Character, Integer> pair : treeMap.entrySet()) {
            Comparable key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
 */