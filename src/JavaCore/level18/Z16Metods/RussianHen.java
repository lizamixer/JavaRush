package level18Core.Z16Metods;

public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 10;
    }

    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());

    }
}
