package com.lesson2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



/**
* Servlet implementation class Dashboard
*/
@WebServlet("/DashboardURL")
public class DashboardURL extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public DashboardURL() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String userId = request.getParameter("userid");
            if (userId == null ) {
                out.println("No UserId was found in the URL.<br>");
            } else {
                out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
            }
            out.println("</body></html>");

        }

}
