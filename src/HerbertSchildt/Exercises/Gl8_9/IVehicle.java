package HerbertSchildt.Exercises.Gl8_9;

public interface IVehicle {
    int range();
    double fuelneeded(int miles);

    int getPassengers();
    void setPassengers(int p);
    int getFuelcsap();
    void setFuelcsap(int f);
    public int getMpg();
    void setMpg(int m);
}
