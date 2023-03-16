package com.github.goodfatcat.javaeetest;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet(name = "firstServlet", value = "/first-servlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        Optional<String> some = Optional.ofNullable(request.getParameter("some"));
        String name = "world";

        if (some.isPresent()) {
            name = some.get();
        }

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        }

        printWriter.println("<html>");
        printWriter.println("<h1>Hello " + name + " </h1>");
        printWriter.println("<h2>You've been here " + count + " times</h2>");
        printWriter.println("</html>");

        session.setAttribute("count", ++count);

        // Forward
//        RequestDispatcher dispatcher = request.getRequestDispatcher("firstjsp");
//        dispatcher.forward(request, response);


        // Redirect
//        response.sendRedirect("firstjsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
