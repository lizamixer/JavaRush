package JavaCore.level21.ARGSEnumAppendPersonDateParseListIndexOf;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments
в меню Run -> Edit Configurations. Или можно зайти в блок справа от молоточка. Очистить все Applications и запустить
программу через правую клавишу. После этого уже проставлять Program arguments.
 */

/*
CRUD
CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-r id
-u id name sex bd
-d id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -r:
Миронов м 15-Apr-1990

Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
Например, при запуске программы c параметрами:
-c name sex bd
получим в методе main
args[0] = "-c"
args[1] = "name"
args[2] = "sex"
args[3] = "bd"
 */

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;
        Date date = null;


        //-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
        if (args[0].equals("-c")) {

            date = formatter.parse(args[3]);

            if (args[2].equals("м")) {
                person = Person.createMale(args[1], date);
            } else {
                person = Person.createFemale(args[1], date);
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));


            //-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
        } else if (args[0].equals("-r")) {
            DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            int id = Integer.parseInt(args[1]);
            person = allPeople.get(id);

            StringBuilder s = new StringBuilder();
            s.append(person.getName());
            s.append(" ");
            s.append(person.getSex() == Sex.MALE ? "м" : "ж");
            s.append(" ");
            s.append(dateFormatPrt.format(person.getBirthDate()));
            System.out.println(s);


            //-u - обновляет данные человека с данным id
        } else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            person = allPeople.get(id);

            person.setName(args[2]);

            if (args[3].equals("м")) {
                person.setSex(Sex.MALE);
            } else {
                person.setSex(Sex.FEMALE);
            }

            date = formatter.parse(args[4]);
            person.setBirthDate(date);


            //-d - производит логическое удаление человека с id, заменяет все его данные на null
        } else if (args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);
            person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

    }
}

/*
public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
    }
}
 */