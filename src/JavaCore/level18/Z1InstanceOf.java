package level18Core;

//Исправь строчку 'Object animal = new Pet();' в методе main() так, чтобы программа вывела "Bingo!".

public class Z1InstanceOf {
    public static void main(String[] args) {
        Object animal = new Tiger(); //тут было new Pet();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }

}
