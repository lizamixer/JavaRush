package JavaCollections.level27.Ex10_RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
К серверу по RMI
Реализуй логику метода run в CLIENT_THREAD. В нем будет имитироваться клиентская часть, которая коннектится к серверу.
1) Из registry получи сервис с именем UNIC_BINDING_NAME.
2) Вызови метод у полученного сервиса, передай любой не пустой аргумент.
3) Выведи в консоль результат вызова метода.
4) Обработай специфические исключения.
Метод main не участвует в тестировании.

Requirements:
1. В методе run() необходимо из registry получить сервис с именем UNIC_BINDING_NAME.
2. В методе run() необходимо вызвать метод doubleString (String) у полученного сервиса.
3. В методе run() необходимо вывести в консоль результат вызова метода doubleString (String).
4. В методе run() должен быть перехват исключения RemoteException.
5. В методе run() должен быть перехват исключения NotBoundException.
 */

public class Solution {
    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;

    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                //registry = LocateRegistry.getRegistry(2099);
                DoubleString service = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
                String temp = service.doubleString("Home sweet home.");
                System.out.println(temp);


            } catch (RemoteException | NotBoundException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) {
        Remote stub = null;
        try {
            registry = LocateRegistry.createRegistry(2099);
            final DoubleStringImpl service = new DoubleStringImpl();

            stub = UnicastRemoteObject.exportObject(service, 0);
            registry.bind(UNIC_BINDING_NAME, stub);
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }

        CLIENT_THREAD.start();
    }
}
