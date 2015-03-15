package ua.artcode.week8.day1.ioc.di;

import java.util.Date;

/**
 * Created by serhii on 14.03.15.
 */
public class ClientLogic implements IClientLogic {

    @ForInject
    private IService service;

    private int count;

    private String name;

    public ClientLogic() {
    }

    public ClientLogic(int count, String name) {
        this.count = count;
        this.name = name;
    }

    public ClientLogic(IService service, int count, String name) {
        this.service = service;
        this.count = count;
        this.name = name;
    }

    public void useService(){
        String formatted = service.format(new Date());
        System.out.println(formatted);
    }

    public void setService(IService service) {
        this.service = service;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
}
