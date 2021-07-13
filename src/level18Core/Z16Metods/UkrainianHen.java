package level18Core.Z16Metods;

public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 5;
    }
    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());

    }
}
