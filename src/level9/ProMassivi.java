/*

public class ProMassivi { //Заполнение массива из 10 чисел, числами от 1 до 10:
    public class MainClass {
        public static void main(String[] args) {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }
        }
    }
}


public class MainClass { //Заполнение массива из 10 чисел, числами от 10 до 1:
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 - i;
        }
    }
}


public class MainClass { //Заполнение массива из 10 чисел, числами от 0 до 9:
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }
}


public class MainClass { //Заполнение массива из 10 чисел, числами от 9 до 0:
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }
    }
}


public class MainClass { //Ввод 10 строк с клавиатуры
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
    }
}


public class MainClass { //Ввод 10 чисел с клавиатуры
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
    }
}


public class MainClass { //Вывод массива на экран
    public static void main(String[] args) throws IOException {
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}


public class MainClass { //Быстрая (статическая) инициализация. Сумма элементов массива:
    public static void main(String[] args) throws IOException {
        //это статическая инициализация
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //подсчёт суммы элементов
        int sum = 0;
        for (int i = 0; i < list.length; i++)
            sum += list[i];

        System.out.println("Sum is " + sum);
    }
}


public class MainClass { //Поиск минимального элемента в массиве:
    public static void main(String[] args) throws IOException {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        System.out.println ("Min is " + min);
    }
}

 */