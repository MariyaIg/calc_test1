package com.ignateva.test1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="threeServlet", value ="/three-servlet")
public class ThreeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/Three number.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // resp.setContentType("text/html");
        //PrintWriter out = resp.getWriter();

        int a = Integer.parseInt(req.getParameter("number1"));
        int b = Integer.parseInt(req.getParameter("number2"));
        int c = Integer.parseInt(req.getParameter("number3"));

        int choice = Integer.parseInt(req.getParameter("choice"));

        Calculation calc= new Calculation(a,b,c);
        if(choice ==1) calc.max(a,b,c);
        if(choice ==2) calc.min(a,b,c);
        if(choice ==3) calc.avg(a,b,c);

       // out.println("<html><body>");
        //out.println("<h1>" + calc.result + "</h1>");
       // out.println("</body></html>");
        req.setAttribute("res",calc.result);
        req.getRequestDispatcher("/Three number.jsp").forward(req,resp);
    }
}
