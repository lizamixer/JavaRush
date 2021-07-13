package dop;

enum Month {

    JANUARY,
    FEBRUARY,
    MARCH
}

public class switchEnum {

    public void printHolidays(Month month) {

        switch (month) {

            case JANUARY:
                System.out.println("7 января будет Рождество!");
                break;
            case FEBRUARY:
                System.out.println("В феврале празднуется День Защитника Отечества - 23 февраля!");
                break;
            case MARCH:
                System.out.println("В марте отмечается Всемирный Женский День - 8 марта!");
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {

        switchEnum reminder = new switchEnum();
        reminder.printHolidays(Month.JANUARY);
    }
}

