package com.ignateva.test1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="textServlet", value = "/text-servlet")
public class TextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/text.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.setContentType("text/html"); если выводить здесь
        //PrintWriter out = resp.getWriter();

        String text = req.getParameter("text");

        TextCount count= new TextCount(text);
        count.countAll();
        /* если выводить здесь
        out.println("<html><body>");
        out.println("<h1> Гласные буквы: " + count.getVowels().toString() + "количество: "+count.getVowels().size()+"</h1>");
        out.println("<h1> Согласные буквы: "+ count.getConsonants().toString() + "количество: " +count.getConsonants().size()+ "</h1>");
        out.println("<h1> Знаки препинания: " + count.getMarks().toString() + "количество: " +count.getMarks().size()+"</h1>");
        out.println("</body></html>");
        */
        req.setAttribute("vow",count.getVowels().toString());
        req.setAttribute("con",count.getConsonants().toString());
        req.setAttribute("marks",count.getMarks().toString());
        req.setAttribute("vow_count",count.getVowels().size());
        req.setAttribute("con_count",count.getConsonants().size());
        req.setAttribute("marks_count",count.getMarks().size());
        req.getRequestDispatcher("/text.jsp").forward(req,resp);
    }
}






