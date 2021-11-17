package JavaCore.level24.Z2_SerializationDate;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
Реализуй логику записи в файл и чтения из файла для класса JavaRush.
Пустых полей у объекта User быть не может. Дату в файле удобно хранить в формате long.
Метод main реализован только для тебя и не участвует в тестировании.

Requirements:
1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users пустой.
2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список users не пустой.
3. Класс Solution.JavaRush не должен поддерживать интерфейс Serializable.
4. Класс Solution.JavaRush должен быть публичным.
5. Класс Solution.JavaRush не должен поддерживать интерфейс Externalizable.
 */

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("/Users/elizavetaandryushina/Desktop/Liza.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("Eva");
            user1.setLastName("K");
            user1.setBirthDate(new Date(1636097657));
            user1.setMale(true);
            user1.setCountry(User.Country.OTHER);
            javaRush.users.add(user1);

            User user2 = new User();
            user2.setFirstName("Eva2");
            user2.setLastName("K2");
            user2.setBirthDate(new Date(1636077657));
            user2.setMale(false);
            user2.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            //if (user1.equals(loadedObject)) System.out.println("Zaebtsa!");
            if (loadedObject.users.contains(user2)) System.out.println("Zaebtsa!");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pw = new PrintWriter(outputStream);
            if (this.users != null) {
                for (User user : users) {
                    pw.print(user.getFirstName() + " ");
                    pw.print(user.getLastName() + " ");
                    pw.print(user.getBirthDate().getTime() + " ");
                    pw.print(user.isMale() + " ");
                    pw.println(user.getCountry());
                }
            }
            pw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                User user = new User();
                user.setFirstName(data[0]);
                user.setLastName(data[1]);
                user.setBirthDate(new Date(Long.parseLong(data[2])));
                boolean b = Boolean.parseBoolean(data[3]);
                user.setMale(b);
                switch (data[4]) {
                    case "RUSSIA" : user.setCountry(User.Country.RUSSIA);
                        break;
                    case "UKRAINE" : user.setCountry(User.Country.UKRAINE);
                        break;
                    case "OTHER" : user.setCountry(User.Country.OTHER);
                        break;
                }
                users.add(user);
            }
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

