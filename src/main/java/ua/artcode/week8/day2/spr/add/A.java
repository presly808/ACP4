package ua.artcode.week8.day2.spr.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.artcode.week8.day1.ioc.di.ClientLogic;
import ua.artcode.week8.day1.ioc.di.IClientLogic;

@Component
public class A {

    @Autowired
    @Qualifier("clientLogic2")
    private IClientLogic logic;

    public A() {
    }

    public IClientLogic getLogic() {
        return logic;
    }

    public void setLogic(ClientLogic logic) {
        this.logic = logic;
    }
}
