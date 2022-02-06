package com.lesson2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



@WebServlet("/LoginServletLoginLogout")
public class LoginServletLoginLogout extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public LoginServletLoginLogout() {
        super();
        // TODO Auto-generated constructor stub
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                 String userId = request.getParameter("userid");
                 HttpSession session=request.getSession();  
             session.setAttribute("userid",  userId);
             response.sendRedirect("DashboardLoginLogout");  
             
        }

}
