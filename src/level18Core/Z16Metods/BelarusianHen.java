package level18Core.Z16Metods;

public class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 15;
    }

    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",
                super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());

    }
}

