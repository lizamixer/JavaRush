package JavaCollections.level27;

import java.io.ByteArrayOutputStream;
import java.security.SecureRandom;

/*
Генератор паролей
Реализуй логику метода getPassword, который должен возвращать ByteArrayOutputStream, в котором будут байты пароля.
Требования к паролю:
1) 8 символов.
2) только цифры и латинские буквы разного регистра.
3) обязательно должны присутствовать цифры, и буквы разного регистра.
Все сгенерированные пароли должны быть уникальные.

Пример правильного пароля:
wMh7smNu

Requirements:
1. Класс Solution должен содержать метод getPassword().
2. Длина пароля должна составлять 8 символов.
3. Пароль должен содержать хотя бы одну цифру.
4. Пароль должен содержать хотя бы одну латинскую букву нижнего регистра.
5. Пароль должен содержать хотя бы одну латинскую букву верхнего регистра.
6. Пароль не должен содержать других символов, кроме цифр и латинских букв разного регистра.
7. Сгенерированные пароли должны быть уникальными.
 */

public class Ex6_ByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final String bigChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String smallChar = "abcdefghijklmnopqrstuvwxyz";
        final String numbers = "0123456789";

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 2; i++) {
            int randomIndex1 = random.nextInt(bigChar.length());
            byteArrayOutputStream.write(bigChar.charAt(randomIndex1));
            for (int y = 0; y < 1; y++) {
                int randomIndex2 = random.nextInt(smallChar.length());
                byteArrayOutputStream.write(smallChar.charAt(randomIndex2));
                for (int x = 0; x < 2; x++) {
                    int randomIndex3 = random.nextInt(numbers.length());
                    byteArrayOutputStream.write(numbers.charAt(randomIndex3));
                }
            }
        }
        return byteArrayOutputStream;
    }
}
