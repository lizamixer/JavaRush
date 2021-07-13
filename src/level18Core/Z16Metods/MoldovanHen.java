package level18Core.Z16Metods;

public class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 3;
    }
    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.MOLDOVA, getCountOfEggsPerMonth());

    }
}
