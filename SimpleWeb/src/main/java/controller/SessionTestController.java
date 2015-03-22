package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by serhii on 22.03.15.
 */
public class SessionTestController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if(session.isNew()){
            System.out.println("Session is new");
            // please login , session invalidate
        } else {
            System.out.println(session.getCreationTime());
            System.out.println(session.getMaxInactiveInterval());

        }
    }
}
