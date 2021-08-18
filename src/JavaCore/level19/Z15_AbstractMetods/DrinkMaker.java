package level19Core.Z15_AbstractMetods;

public abstract class DrinkMaker {

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

