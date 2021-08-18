package level16and17Core;

//Реализуй в классе Fox интерфейс Animal.
//Поменяй код так, чтобы в классе Fox был только один метод - getName.
//Учти, что создавать дополнительные классы и удалять методы нельзя.
//Requirements:
//1. Интерфейс Animal должен быть реализован в классе Fox.
//2. В классе Fox должен быть реализован только один метод (getName).
//3. В интерфейсе Animal нужно объявить метод getColor.
//4. Дополнительные классы или интерфейсы создавать нельзя.

import java.awt.*;

public class Z12AbstractNasledovanie {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    abstract class Fox implements Animal {

        public String getName() {
            return "Fox";
        }
    }
}
