package JavaSyntax.level10;

/*
А мне так нужно
Реализуй метод toCustomString, чтобы он преобразовывал Number к String по определенному правилу в зависимости от типа:
- если аргумент является объектом Byte, то разделить его на 2 и преобразовать в строку, добавив в конце букву "b";
- если аргумент является объектом Integer, то разделить его на 3 и преобразовать в строку;
- если аргумент является объектом Double, то умножить его на 20 и преобразовать в строку;
- если аргумент не относится ни к одному из вышеперечисленных типов, то вернуть строку "Я такого типа числа не жду!".
Класс Number является родителем классов Byte, Double, Float, Integer, Long и Short.
Для определения типа используй оператор instanceof.

Requirements:
1. Метод toCustomString должен разделить входящий параметр на 2 и добавить в конце букву b, если входящий параметр является объектом Byte.
2. Метод toCustomString должен разделить входящий параметр на 3, если входящий параметр является объектом Integer.
3. Метод toCustomString должен умножить входящий параметр на 20, если входящий параметр является объектом Double.
4. Метод toCustomString должен вернуть строку "Я такого типа числа не жду!", если входящий параметр не Byte, не Integer, и не Double.
5. Для определения типа нужно использовать оператор instanceof.
 */

public class Z7_InstanceOf {
    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        //напишите тут ваш код
        String format = UNEXPECTED_TYPE;
        if (number instanceof Byte) {
            int number2 = Byte.parseByte(number.toString()) / 2;
            format = String.valueOf(number2) + "b";
        } else if (number instanceof Integer) {
            Integer number2 = Integer.parseInt(number.toString()) / 3;
            format = String.valueOf(number2);
        } else if (number instanceof Double) {
            double number2 = Double.parseDouble(number.toString()) * 20;
            format = String.valueOf(number2);
        }

        return format;
    }
}

