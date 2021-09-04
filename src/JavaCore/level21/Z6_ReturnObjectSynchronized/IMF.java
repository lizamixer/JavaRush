package JavaCore.level21.Z6_ReturnObjectSynchronized;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class) {
            if (imf == null) {          //инициализация блока imf так, чтобы метод всегда возвращал один и тот же объект
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {

    }
}
/*
public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        return imf;
    }

    private IMF() {

    }
}
 */

