package com.ignateva.test1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="calcServlet",value ="/calc-servlet")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/calculator.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.setContentType("text/html");
        //PrintWriter out = resp.getWriter();

        double a = Integer.parseInt(req.getParameter("number1"));
        double b = Integer.parseInt(req.getParameter("number2"));

        int choice = Integer.parseInt(req.getParameter("choice"));

        Calculation calc= new Calculation(a,b);
        switch (choice) {
            case 1: calc.add(a,b);break;
            case 2: calc.sub(a,b);break;
            case 3: calc.mult(a,b);break;
            case 4: calc.div(a,b);break;
            case 5: calc.pow(a,b);break;
            case 6: calc.percent(a,b);break;

        }
        // out.println("<html><body>");
        //out.println("<h1>" + calc.result + "</h1>");
        // out.println("</body></html>");
        req.setAttribute("res",calc.result);
        req.getRequestDispatcher("/calculator.jsp").forward(req,resp);
    }
}

