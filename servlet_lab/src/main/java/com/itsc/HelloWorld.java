package com.itsc;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class HelloWorld extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        res.setContentType("text/html");

        
        PrintWriter pw = res.getWriter();

        
        String userName = req.getParameter("username");
        String age = req.getParameter("age");

        
        if (userName == null || userName.isEmpty()) {
            userName = "Guest";
        }
        
        if (age == null || age.isEmpty()) {
          age = "21";
        }

        // Send the response
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>Hello, " + userName + "</h1>");
        pw.println("<h2>You are " + age + "</h2>");
        pw.println("</body>");
        pw.println("</html>");
        
        // Close the PrintWriter
        pw.close();
    }
}
