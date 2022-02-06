package com.lesson2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/DashboardHiddenForm")
public class DashboardHiddenForm extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
    public DashboardHiddenForm() {
        super();
        // TODO Auto-generated constructor stub
    }

        
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            String userId = request.getParameter("userid");
            if (userId == null) {
                out.println("No UserId was found in hidden form field.<br>");
            } else {
                out.println("UserId found in hidden form field: " + userId + "<br>");
                
            }
            out.println("</body></html>");

        }

}
