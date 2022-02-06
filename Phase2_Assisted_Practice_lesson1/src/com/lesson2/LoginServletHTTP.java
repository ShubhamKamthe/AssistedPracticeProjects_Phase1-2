package com.lesson2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServletHTTP")
public class LoginServletHTTP extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    
    public LoginServletHTTP() {
        super();
       
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                 String userId = request.getParameter("userid");
                 HttpSession session=request.getSession();  
             session.setAttribute("userid",  userId);
                          
             response.sendRedirect("DashboardHTTP");  
                
        }


}
