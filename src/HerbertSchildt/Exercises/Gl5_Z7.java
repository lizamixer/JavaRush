package HerbertSchildt.Exercises;

//шифрование с ключом из строки
public class Gl5_Z7 {
    public static void main(String[] args) {
        String msg = "Это просто текст";
        String encmsg = "";
        String decmsg = "";
        String key = "шифршифр";
        int j = 0;

        System.out.println("Исходное сообщение: " + msg);

        //шифрование сообщения
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.println("Зашифрованное сообщение: " + encmsg);

        //дешифровка сообщения
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.println("Дешифрованное сообщение: " + decmsg);
    }
}
