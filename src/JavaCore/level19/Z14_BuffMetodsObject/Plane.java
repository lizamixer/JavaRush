package level19Core.Z14_BuffMetodsObject;

public class Plane implements CanFly { //этого класса не было
    int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public Plane() {
    }

    @Override
    public void fly() {
    }

}

