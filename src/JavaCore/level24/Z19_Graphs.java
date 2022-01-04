package JavaCore.level24;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/*
Знакомство с графами
Прочитать в дополнительных материалах о сериализации графов.
Дан ориентированный плоский граф Solution, содержащий циклы и петли.
Пример, http://edu.nstu.ru/courses/saod/images/graph1.gif
Сериализовать Solution.
Все данные должны сохранить порядок следования.

Requirements:
1. В классе Solution должно существовать поле edges.
2. В классе Solution должно существовать поле node.
3. Тип поля node должен быть int.
4. Класс Solution должен поддерживать интерфейс Serializable.
 */

public class Z19_Graphs {
    public static class Solution implements Serializable {
        int node;
        List<Solution> edges = new LinkedList<>();

        public static void main(String[] args) throws IOException, ClassNotFoundException {
            Solution solution = new Solution();

            FileOutputStream fileOutputStream = new FileOutputStream("your.file.name");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(solution);
            objectOutputStream.reset();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("your.file.name");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Solution solution1 = (Solution) objectInputStream.readObject();
            objectInputStream.close();
        }
    }
}

/*
public class Solution {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) {

    }
}
 */