package level12;

//Текущая версия программы: программа считывает с консоли строки, пока не будет введена пустая строка.
//Считанные строки — это фамилии жильцов домов, которые сохраняются в список.
//Далее считывается с консоли целое число — номер дома. Номер дома соответствует индексу элемента списка жильцов.
//По номеру дома программа выводит на экран фамилию его жильца.
//Новая версия программы: программа считывает с консоли строки, пока не будет введена пустая строка.
//Поочередно вводятся название города и фамилия семьи, которая живет в этом городе.
//Подумай какая структура данных лучше всего подходит для хранения пары "название города - фамилия семьи".
//Далее считывается с консоли строка - название города.
//Программа должна по названию города выводить на экран фамилию семьи, которая в нем проживает.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Z20mapArraylistVivodsKlavi {
    public static void main(String[] args) throws IOException {
        /*
        мое решение:
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<String, String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            map.put(city, family);
        }

        // Read the house number
        String city2 = reader.readLine();

        String x = map.getOrDefault(city2, "");
        System.out.println(x);
         */

        //не мое решение
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> city = new ArrayList<>();
        List<String> list = new ArrayList<>();

        while (true) {
            String nameCity = reader.readLine();
            if (nameCity.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            city.add(nameCity);
            list.add(family);
        }

        int indexCity = city.indexOf(reader.readLine());
        if (indexCity >= 0 && indexCity < list.size()) {
            System.out.println(list.get(indexCity));
        }
    }
}
//та программа что была изначально
/*
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (houseNumber >= 0 && houseNumber < list.size()) { //!!!!!!!!!ЗАПОМНИТЬ!!!!!!!!!!!!
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
 */