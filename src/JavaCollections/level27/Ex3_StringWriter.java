package JavaCollections.level27;
import java.io.*;

/*
Читаем из потока
Реализуй логику метода getAllDataFromInputStream. Он должен вернуть StringWriter, содержащий все данные из переданного потока.
Возвращаемый объект ни при каких условиях не должен быть null.
Метод main не участвует в тестировании.

Requirements:
1. Публичный статический метод getAllDataFromInputStream (InputStream) должен существовать.
2. Метод getAllDataFromInputStream (InputStream) должен возвращать StringWriter.
3. Метод getAllDataFromInputStream (InputStream) должен вернуть StringWriter, который содержит все данные из переданного потока.
4. Возвращаемый объект ни при каких условиях не должен быть null.
 */

public class Ex3_StringWriter {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("/Users/elizavetaandryushina/Desktop/file.txt"));
        System.out.println(writer);
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter sW = new StringWriter();
        if (is != null) {
            BufferedReader bR = new BufferedReader(new InputStreamReader(is));
            StringBuilder sB = new StringBuilder();
            String line;
            while ((line = bR.readLine()) != null) {
                sB = new StringBuilder(line);
            }
            sW.write(sB.toString());
        }
        return sW;
    }
}
