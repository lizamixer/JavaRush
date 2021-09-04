package JavaCore.level21;

/*
Comparable
Реализуй интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботься, чтобы все методы были синхронизированы.
Реализуй метод compareTo так, чтобы при сравнении двух пляжей он выдавал:
– положительное число, если первый пляж лучше;
– отрицательное число, если второй пляж лучше;
– ноль, если пляжи одинаковые.
Сравни каждый критерий по отдельности, чтобы победителем был пляж с лучшими показателями по большинству критериев. Учти при сравнении, чем меньше расстояние к пляжу (distance), тем пляж лучше.
Requirements:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable<Beach>.
3. Метод compareTo класса Beach должен учитывать качество пляжа (quality) и дистанцию (distance).
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.
 */

public class Z9_Sravnenie implements Comparable<Z9_Sravnenie> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Z9_Sravnenie (String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }


    public synchronized String getName() { //расставила везде synchronized
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Z9_Sravnenie o) { //выставила synchronized и описала метод
        int current = 0;
        int other = 0;
        float deltaDistance = distance - o.getDistance();
        if (deltaDistance > 0) {
            other++;
        } else if (deltaDistance < 0) {
            current++;
        }
        int deltaQuality = quality - o.getQuality();
        if (deltaQuality > 0) {
            current++;
        } else if (deltaQuality < 0) {
            other++;
        }

        return current - other;
    }
}
