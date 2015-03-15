package ua.artcode.week8.day2.spr.add;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by serhii on 15.03.15.
 */
public class InitComponents {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext(
                "classpath:week8/app-context.xml");
        // A a = new
        A a = app.getBean("a", A.class);
        a.getLogic().useService();
    }

}
