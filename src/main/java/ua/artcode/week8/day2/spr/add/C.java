package ua.artcode.week8.day2.spr.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.artcode.week8.day1.ioc.di.IService;

@Component
public class C {

    @Autowired
    public IService service;

    public C() {
    }

    public IService getService() {
        return service;
    }

    public void setService(IService service) {
        this.service = service;
    }
}
