package level19Core.Z20_Singleton;

public class Sun implements Planet {
    private static Sun instance;

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    private Sun() {
    }

}
