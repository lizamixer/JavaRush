package level16and17Core;

//Исправь код так, чтобы программа выполнялась и выводила фразу: "Я переводчик с английского".
//Метод main менять нельзя!
//Requirements:
//1. Программа должна выводить на экран фразу: "Я переводчик с английского".
//2. Метод translate должен возвращать строку: "Я переводчик с английского".
//3. Программа должна выполняться без ошибок.
//4. Метод main должен выводить на экран результат вызова метода translate у объекта типа Translator.

public class Z11AbstractError {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator { //тут было написано abstract
        public String translate() {
            return "Я переводчик с английского";
        }
    }


}
