package level10;

//При сужении типа может произойти отбрасывание части числа. А может и не произойти.
//Реализуй методы isByte, isShort, isInt. Они должны определять, можно ли входящий аргумент
//"безболезненно" преобразовать к типам byte, short и int.

public class Z3privedenietipov {
    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false

        //это еще одна задачка
        //Добавь одну операцию по преобразованию типа, чтобы получился ответ: b = 0.
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + f);
        b = (byte) b; //я добавила вот эту строку
        System.out.println(b);
        //конец задачки
    }

    public static boolean isByte(long l) {
        byte b = (byte) l;
        long x = l - (int) b;
        return (x == 0);
    }

    public static boolean isShort(long l) {
        short s = (short) l;
        long y = l - (int) s;
        return (y == 0);
    }

    public static boolean isInt(long l) {
        int i = (int) l;
        long z = l - (int) i;
        return (z == 0);
    }
}
