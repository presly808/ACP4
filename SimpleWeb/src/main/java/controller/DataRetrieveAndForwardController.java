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

@WebServlet(name = "userInfoServlet", value = "/user")
public class DataRetrieveAndForwardController extends HttpServlet {

    public static final String PATH = "/WEB-INF/jsp/user-info.jsp";
    private UserContainer container;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        container = (UserContainer) config.getServletContext().getAttribute("userContainer");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getParam = req.getParameter("id");

        if(getParam == null){
            resp.sendRedirect("/pages/error.jsp");
        } else {
            int id = Integer.parseInt(getParam);
            User user = container.getMap().get(id);
            req.setAttribute("user",user);
            req.getRequestDispatcher(PATH).forward(req,resp);
        }






    }

}
