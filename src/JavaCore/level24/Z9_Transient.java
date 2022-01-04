package JavaCore.level24;

import JavaCore.level24.Z1_Serialization.Asset;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
Сериализуй класс Solution.
Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
2) создать экземпляр класса Solution - savedObject;
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
4) создать другой экземпляр класса Solution с другим параметром;
5) загрузить из потока на чтение объект - loadedObject;
6) проверить, что savedObject.string равна loadedObject.string;
7) обработать исключения.

Requirements:
1. Поле pattern должно быть отмечено модификатором transient.
2. Поле currentDate должно быть отмечено модификатором transient.
3. Поле temperature должно быть отмечено модификатором transient.
4. Поле string НЕ должно быть отмечено модификатором transient.
 */

public class Z9_Transient implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //System.out.println(new Z9_Transient(4));

        File fileName = new File("/Users/elizavetaandryushina/Desktop/Liza2.txt"); //1
        OutputStream outputStream = new FileOutputStream(fileName);
        InputStream inputStream = new FileInputStream(fileName);

        Z9_Transient savedObject = new Z9_Transient(1); //2

        PrintWriter pw = new PrintWriter(outputStream); //3
        pw.print(savedObject);
        pw.close();
        outputStream.close();

        Z9_Transient loadedObject = new Z9_Transient(2); //4
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        loadedObject.string = br.readLine(); //5

        System.out.println(savedObject.string.equals(loadedObject.string)); //6
        br.close();
        inputStream.close();
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Z9_Transient(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
