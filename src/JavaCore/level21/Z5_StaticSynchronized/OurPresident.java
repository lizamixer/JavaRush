package JavaCore.level21.Z5_StaticSynchronized;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }

}

