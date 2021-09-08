package level9;//1
//У кота (класс Cat) должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
//2
//Тебе предстоит реализовать котов во плоти: разумеется, по образу и подобию класса Cat, а точнее -
// основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
//Наполни этих троих жизнью, то есть, конкретными данными.
//3
//Реализуй метод boolean fight(Cat anotherCat): продумай механизм драки котов в зависимости от их веса, возраста и силы.
//Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
//Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
//Если ничья и никто не выиграл, возвращаем false.
//4
//Создай три кота, используя класс Cat.
//Проведи три боя попарно между котами.
//Класс Cat создавать не надо. Для боя используй метод boolean fight(Cat anotherCat).
//Результат каждого боя выведи на экран c новой строки.

public class Z64_MethodsiObject {
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight (Cat anotherCat){
            int mePoint = 0;
            int otherPoint = 0;

            if(anotherCat.weight > this.weight){
                otherPoint++;
            }
            else if(anotherCat.weight < this.weight){
                mePoint++;
            }

            if(anotherCat.age > this.age){
                otherPoint++;
            }else if(anotherCat.age < this.age){
                mePoint++;
            }

            if(anotherCat.strength > this.strength){
                otherPoint++;
            }
            else if(anotherCat.strength < this.strength){
                mePoint++;
            }
            return mePoint > otherPoint;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1", 32, 4, 6);
        Cat cat2 = new Cat("cat2", 4, 56, 66);
        Cat cat3 = new Cat("cat3", 6, 7, 34);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }
}

