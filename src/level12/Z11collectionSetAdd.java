package level12;

//Создать множество строк (Set), занести в него 20 слов на букву «Л».

import java.util.HashSet;
import java.util.Set;

public class Z11collectionSetAdd {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<String>();

        set.add("Лиза"); //пипец оказалось что все элементы в сете могут быть только уникальные, поэтому без фора
        set.add("Лоза");
        set.add("Лавот");
        set.add("Лтыв");
        set.add("Лыва");
        set.add("Лцшу");
        set.add("Луцк");
        set.add("Лнк");
        set.add("Ло");
        set.add("Лпватпа");
        set.add("Лофывт");
        set.add("Лавыьтаы");
        set.add("Лвфы");
        set.add("Лываиол");
        set.add("Лтолтвы");
        set.add("Латоцу");
        set.add("Луцоа");
        set.add("Лвыотлао");
        set.add("Лвыаоты");
        set.add("Ладлуы");

        return set;
    }

    public static void main(String[] args) {

    }
}