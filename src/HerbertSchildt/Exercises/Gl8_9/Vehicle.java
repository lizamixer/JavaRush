package HerbertSchildt.Exercises.Gl8_9;

public class Vehicle implements IVehicle {
    private int passengers;
    private int fuelcsap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcsap = f;
        mpg = m;
    }

    @Override
    public int range() {
        return mpg * fuelcsap;
    }

    @Override
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int p) {
        p = passengers;
    }

    @Override
    public int getFuelcsap() {
        return fuelcsap;
    }

    @Override
    public void setFuelcsap(int f) {
        f = fuelcsap;
    }

    @Override
    public int getMpg() {
        return mpg;
    }

    @Override
    public void setMpg(int m) {
        m = mpg;
    }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargo() {
        return cargocap;
    }

    void setCargo(int c) {
        cargocap = c;
    }

}

class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 20, 7, 4400);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти " + semi.getCargo() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу потребуется " + gallons + " галлонов топлива.");
    }
}
