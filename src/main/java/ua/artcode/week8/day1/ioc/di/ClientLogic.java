package ua.artcode.week8.day1.ioc.di;

import java.util.Date;

/**
 * Created by serhii on 14.03.15.
 */
public class ClientLogic {

    @ForInject
    private IService service;

    public ClientLogic() {
    }

    public void useService(){
        String formatted = service.format(new Date());
        System.out.println(formatted);
    }

}
