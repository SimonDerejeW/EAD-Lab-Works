package com.itsc;

//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/add")
public class AddServlets extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        
        String num1Str = req.getParameter("num1");
        String num2Str = req.getParameter("num2");

        
        int n1 = 0;
        int n2 = 0;

        try {
            if (num1Str != null && !num1Str.isEmpty()) {
                n1 = Integer.parseInt(num1Str);
            }
            if (num2Str != null && !num2Str.isEmpty()) {
                n2 = Integer.parseInt(num2Str);
            }

            int result = n1 + n2;
            resp.getWriter().println("The sum is: " + result);
        } catch (NumberFormatException e) {
            
            resp.getWriter().println("Invalid input: please provide valid integers for num1 and num2.");
        }
    }
}
