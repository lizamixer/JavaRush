package level9;//В классе StringHelper реализуй два статических метода:
//String multiply(String s, int count) – возвращает строку, повторенную count раз;
//String multiply(String s) – возвращает строку, повторенную 5 раз.

public class Z76vozvratconstructor {
    public static String multiply(String text) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            System.out.print(text);
            result = result + text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            System.out.print(text);
            result = result + text;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}