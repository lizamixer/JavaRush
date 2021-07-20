package level19Core;

//В этой задаче тебе нужно:
//Создать 7 нестатических public полей класса:
//intVar типа int
//doubleVar типа double
//DoubleVar типа Double
//booleanVar типа boolean
//ObjectVar типа Object
//ExceptionVar типа Exception
//StringVar типа String
//Убедиться, что они инициализируются дефолтными значениями.
//Вывести их значения в заданном порядке в методе main()
//Requirements:
//1. В классе Solution должно быть объявлено поле intVar типа int.
//2. В классе Solution должно быть объявлено поле doubleVar типа double.
//3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
//4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
//5. В классе Solution должно быть объявлено поле ObjectVar типа Object.
//6. В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
//7. В классе Solution должно быть объявлено поле StringVar типа String.
//8. Метод main должен выводить значения полей на экран (каждое — с новой строки или через пробел)
// в заданном порядке. Инициализировать переменные не нужно.

public class Z12_VivodNeInitinPeremennix {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Z12_VivodNeInitinPeremennix vivod = new Z12_VivodNeInitinPeremennix();
        System.out.println(vivod.intVar);
        System.out.println(vivod.doubleVar);
        System.out.println(vivod.DoubleVar);
        System.out.println(vivod.booleanVar);
        System.out.println(vivod.ObjectVar);
        System.out.println(vivod.ExceptionVar);
        System.out.println(vivod.StringVar);
    }

}
/*
public class Z12_VivodNeInitinPeremennix {

    public static void main(String[] args) {
    }
}
 */