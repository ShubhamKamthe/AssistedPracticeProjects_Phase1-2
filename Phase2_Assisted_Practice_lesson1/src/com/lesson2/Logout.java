package com.lesson2;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logout")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;

public Logout() {
    super();
    // TODO Auto-generated constructor stub
}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            HttpSession session=request.getSession();  
            session.invalidate();           
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
        out.println("Logged out of session.<br>");
        out.println("</body></html>");
    }

}
