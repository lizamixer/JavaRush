package JavaCore.level22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*
Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).
Пример:
','=44, 's'=115, 't'=116.
Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.
Пример вывода:
, 19
- 7
f 361

Requirements:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
 */

public class Z25_IOFrequencyCountSymbols {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        ArrayList<Character> arrayList = new ArrayList<>();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        while (fileInputStream.available() > 0) {
            arrayList.add((char) fileInputStream.read());
        }
        int count;
        for (Character i : arrayList) {
            count = Collections.frequency(arrayList, i);
            treeMap.put(i, count);
        }
        for (Character s : treeMap.keySet()) {
            System.out.println(s + " " + treeMap.get(s));
        }
        fileInputStream.close();
    }
}

/*
еще один вариант решения
1. Считываем все в буфер byte[] buffer, как делали в предыдущих задачах.
2. Далее создаем TreeMap <Byte, Integer>, чтобы он сразу при добавлении выстраивал наши элементы в естественном порядке (то есть по возрастанию
кода символа (он же ключ карты), как нам и нужно)
3. Обходим в цикле все элементы нашего буфера. Если такой символ в карте уже есть (проверяем через map.containsKey), то увеличиваем значение
этого элемента на 1 (через map.put(b,(int) map.get(b) + 1), если нет, то добавляем новый элемент (тоже через map.put(b,1)).
4. В конце проходим по элементам нашей карты и выводим все на экран как просят, при этом преобразуя байты в символы простым приведением через (char) b.
Надеюсь, кому-нибудь будет полезно, сам специально через Map решал не потому что я прям вот всегда так делаю, а чтобы еще раз вспомнить и
закрепить, как с этим объектом работать.
 */
/*
мой вариант решения
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileInputStream fileInputStream = new FileInputStream(args[0]);

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
        reader.close();
 */