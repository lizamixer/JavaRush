package JavaCollections.level27.Ex12_ServiceLocator.service.Impl;

import JavaCollections.level27.Ex12_ServiceLocator.service.Service;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }

}
