package ua.artcode.week8.day2.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.artcode.week8.day1.ioc.di.IService;

import java.util.Date;

/**
 * Created by serhii on 15.03.15.
 */
public class InitAppContext {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext(
                "classpath:week8/app-context.xml");

        IService service = (IService) app.getBean("serviceA");

        System.out.println(service.format(new Date()));


    }
}
