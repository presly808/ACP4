package listener;

import model.UserContainer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        UserContainer container = new UserContainer();
        sce.getServletContext().setAttribute("userContainer", container);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
