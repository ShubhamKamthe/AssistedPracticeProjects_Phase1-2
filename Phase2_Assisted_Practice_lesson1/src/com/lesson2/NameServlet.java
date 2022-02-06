package com.lesson2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
        
                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                        // TODO Auto-generated method stub
                        String fname = request.getParameter("fname");
                        String lname = request.getParameter("lname");
                        
                        PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    out.println("Your full name is " + fname + " " + lname);
                    out.println("</body></html>");
                }
        }
