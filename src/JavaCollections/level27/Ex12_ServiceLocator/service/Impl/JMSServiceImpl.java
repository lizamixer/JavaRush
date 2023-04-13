package JavaCollections.level27.Ex12_ServiceLocator.service.Impl;

import JavaCollections.level27.Ex12_ServiceLocator.service.Service;

public class JMSServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the JMSService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }

}
