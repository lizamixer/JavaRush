package level13;

//В методе handleExceptions обработайте все checked исключения.
//Нужно вывести на экран возникшее checked исключение.
//Можно использовать только один блок try..catch.
//оказалось имеется ввиду не 1 блок кетч, а вообще конструкцию

import java.io.IOException;
import java.rmi.RemoteException;

public class Z15Exception2 {
    public static void main(String[] args) {
        handleExceptions(new Z15Exception2());

    }

    public static void handleExceptions(Z15Exception2 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RemoteException e) {
            System.out.println("RemoteException");
        }
        catch (IOException e) {
            System.out.println("IOException");
        }
        catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}

