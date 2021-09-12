package HerbertSchildt.Exercises;

//среднее значение в массиве
public class Gl5_Z3 {
    public static void main(String[] args) {
        double massiv[] = {1.2, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};

        double average = 0;
        for (double d: massiv) {
            average += d;
        }
        average = average/massiv.length;
        System.out.println(average);
    }
}
