package com.isa.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Enumeration;


@WebServlet("/infoShareAcademy")
public class BusinessCardAdam extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        LocalDateTime dateTime = LocalDateTime.now();
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("<!DOCTYPE HTML><html><body>");
        resp.getWriter().println("Adam Przybyłowski");
        resp.getWriter().println("<br>JJDD8 - FourPlusOne");
        resp.getWriter().println("<br>" + dateTime);
        resp.getWriter().println("</body></html>");
    }


    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter();

        Enumeration requiredName = req.getParameterNames();

        while (requiredName.hasMoreElements()) {
            Object required = requiredName.nextElement();
            String parameterName = required.toString();
            String parameterValue = req.getParameter(parameterName);
            resp.getWriter().println(parameterName + " = " + parameterValue);
        }
        resp.getWriter().close();

    }

}







