package JavaCore.level21.ARGSSwitchArrayIndex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion.

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u - обновляет соответствующие данные людей с заданными id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке.
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople.
Порядок вывода данных соответствует вводу данных.
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997


Requirements:
1. Класс Solution должен содержать public static volatile поле allPeople типа List<Person>.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople, и выводить id каждого (index) на экран.
4. При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
5. При параметре -d программа должна логически удалять людей с заданными id в списке allPeople.
6. При параметре -i программа должна выводить на экран данные о всех людях с заданными id по формату указанному в задании.
7. Метод main класса Solution должен содержать оператор switch по значению args[0].
8. Каждый case оператора switch должен иметь блок синхронизации по allPeople.
 */

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = null;
        Date date = null;

        switch (args[0]) {
            //-с - добавляет всех людей с заданными параметрами в конец allPeople,
            //выводит id (index) на экран в соответствующем порядке
            case ("-c"):

                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i += 3) {
                        String nameArgs = args[i];
                        String sexArgs = args[i + 1];
                        String dateArgs = args[i + 2];

                        date = formatter.parse(dateArgs);
                        if (sexArgs.equals("м")) {
                            person = Person.createMale(nameArgs, date);
                        } else {
                            person = Person.createFemale(nameArgs, date);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }

                }
                /*
                for (int i = 0; i < allPeople.size(); i++) {

                    person = allPeople.get(i);

                    StringBuilder s = new StringBuilder();
                    s.append(person.getName());
                    s.append(" ");
                    s.append(person.getSex() == Sex.MALE ? "м" : "ж");
                    s.append(" ");
                    s.append(dateFormatPrt.format(person.getBirthDate()));
                    System.out.println(s);
                }
                 */

                break;

            //-u - обновляет данные человека с данным id
            case ("-u"):
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i += 4) {
                        String idArgs = args[i];
                        String nameArgs = args[i + 1];
                        String sexArgs = args[i + 2];
                        String dateArgs = args[i + 3];

                        int id = Integer.parseInt(idArgs);
                        person = allPeople.get(id);

                        person.setName(nameArgs);

                        if (sexArgs.equals("м")) {
                            person.setSex(Sex.MALE);
                        } else {
                            person.setSex(Sex.FEMALE);
                        }

                        date = formatter.parse(dateArgs);
                        person.setBirthDate(date);
                    }

                }
                break;

            //-d - производит логическое удаление человека с id, заменяет все его данные на null
            case ("-d"):

                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        String idArgs = args[i];

                        int id = Integer.parseInt(idArgs);
                        person = allPeople.get(id);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }

                }

                break;

            //-i - выводит на экран информацию о всех людях с заданными id: name sex bd
            case ("-i"):

                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        String idArgs = args[i];

                        int id = Integer.parseInt(idArgs);
                        person = allPeople.get(id);

                        StringBuilder s = new StringBuilder();
                        s.append(person.getName());
                        s.append(" ");
                        s.append(person.getSex() == Sex.MALE ? "м" : "ж");
                        s.append(" ");
                        s.append(dateFormatPrt.format(person.getBirthDate()));
                        System.out.println(s);
                    }

                }

                break;
        }

    }
}

