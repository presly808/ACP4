package controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Create MyFirstServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getCookies();

        String key = "12345";
        String tempUserKey = "tempUserKey";
        req.setAttribute(tempUserKey, key);


        Cookie cookie = new Cookie(tempUserKey, key);
        resp.addCookie(cookie);

        PrintWriter pw = resp.getWriter();
        pw.println("<h1>HELLO WORD</h1>");
        pw.flush();




    }
}
