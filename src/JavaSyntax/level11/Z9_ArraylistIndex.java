package level11;

//Создай список слов, заполни его самостоятельно.
//Метод fix должен:
//2.1. удалять из списка строк все слова, содержащие букву "р".
//2.2. удваивать все слова, содержащие букву "л".
//2.3. если слово содержит и букву "р", и букву "л", то оставить это слово без изменений.
//2.4. с другими словами ничего не делать.

import java.util.ArrayList;

public class Z9_ArraylistIndex {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = strings.size()-1; i >= 0; i--){
            if(strings.get(i).indexOf("л")!=-1){
                strings.add(strings.get(i));
            }
            if (strings.get(i).indexOf("р") != -1) {
                strings.remove(strings.get(i));
            }
        }
        return strings;
    }
}