package controller;

import model.User;
import model.UserContainer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "addUserServlet", value = "/addUser")
public class AddUserController extends HttpServlet {

    private UserContainer container;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        container = (UserContainer) config.getServletContext().getAttribute("userContainer");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");
        Double salary = Double.parseDouble(req.getParameter("salary"));


        int id = container.getMap().size() + 1;
        User user = new User(id,name,salary);

        // TODO multi thread access to map, resolve problem
        container.getMap().put(id, user);

        resp.sendRedirect("/user?id=" + id);
        //req.getRequestDispatcher("/user?id=" + id).forward(req,resp);
    }
}
