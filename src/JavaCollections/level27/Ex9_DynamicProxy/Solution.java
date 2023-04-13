package JavaCollections.level27.Ex9_DynamicProxy;

/*
Дженерики для создания прокси-объекта
В классе Solution создай публичный метод getProxy:
1) Метод getProxy должен возвращать прокси для любого интерфейса, который наследуется от Item.
2) getProxy должен иметь два параметра. Первый - класс возвращаемого типа, второй - классы дополнительных интерфейсов (используй аргумент переменной длины ...).
3) Используй ItemInvocationHandler для создания прокси.
Метод main не участвует в тестировании.

Requirements:
1. В классе Solution должен существовать метод getProxy.
2. Метод getProxy должен иметь два параметра. Первый - класс возвращаемого типа, второй - классы дополнительных интерфейсов.
3. Метод getProxy должен возвращать прокси для любого интерфейса, который наследуется от Item.
4. В методе getProxy при вызове Proxy.newProxyInstance передай this.getClass().getClassLoader() в качестве первого аргумента.
5. В методе getProxy при вызове Proxy.newProxyInstance передай вторым аргументом все интерфейсы, которые прокси должен реализовать.
6. В методе getProxy при вызове Proxy.newProxyInstance передай new ItemInvocationHandler() как третий аргумент.
7. Метод getProxy должен работать согласно с условием.
 */


import java.lang.reflect.Proxy;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution.getProxy(Item.class));                        //true false false
        test(solution.getProxy(Item.class, Small.class));           //true false true
        test(solution.getProxy(Item.class, Big.class, Small.class));//true true true
        test(solution.getProxy(Big.class, Small.class));            //true true true т.к. Big наследуется от Item
        test(solution.getProxy(Big.class));                         //true true false т.к. Big наследуется от Item
    }


    private static void test(Object proxy) {
        boolean isItem = proxy instanceof Item;
        boolean isBig = proxy instanceof Big;
        boolean isSmall = proxy instanceof Small;

        System.out.format("%b %b %b\n", isItem, isBig, isSmall);
    }

    public <T extends Item> T getProxy(Class<?> itemClass, Class<?>... additionalClasses) {
        Class[] interfaces = new Class[additionalClasses.length + 1];
        interfaces[0] = itemClass;
        //копируем из additionalClasses в interfaces с позиции 0 на позицию 1 до длины additionalClasses.length
        System.arraycopy(additionalClasses, 0, interfaces, 1, additionalClasses.length);
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), interfaces, new ItemInvocationHandler());
    }
}
