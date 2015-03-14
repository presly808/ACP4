package ua.artcode.week8.day1.ioc.di;

import ua.artcode.model.Client;

/**
 * Created by serhii on 14.03.15.
 */
public class TestClientLogic {

    public static void main(String[] args) {
        DependencyInjector dependencyInjector = new DependencyInjector();
        ClientLogic clientLogic = new ClientLogic();

        dependencyInjector.makeDependencies(clientLogic);

        clientLogic.useService();
    }

}
