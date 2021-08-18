package level19Core.Z20_Singleton;

public class Moon implements Planet {
    private static Moon instance;

    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }

    private Moon() {
    }

}
