package level16and17Core;

import java.awt.*;

//Унаследуй Fox от интерфейса Animal.
//Поменяй код так, чтобы в классе Fox был только один метод - getName.
//Учти, что методы удалять нельзя.
//Requirements:
//1. Интерфейс Animal должен быть реализован в классе Fox.
//2. В классе Fox должен быть реализован только один метод — getName.
//3. В интерфейсе Animal должен быть объявлен метод getColor.
//4. Дополнительные классы или интерфейсы создавать нельзя.

public class Z18Vozvrat1Metoda {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
        Integer getAge();
    }

    public static abstract class Fox implements Animal { //тут не было abstract
        public String getName() {
            return "Fox";
        }

    }
}

