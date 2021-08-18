package level19Core.Z20_Singleton;

public class Earth implements Planet {
    private static Earth instance;

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }

    private Earth () {
    }

}
