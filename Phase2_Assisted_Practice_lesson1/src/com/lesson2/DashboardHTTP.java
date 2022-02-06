package com.lesson2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/DashboardHTTP")
public class DashboardHTTP extends HttpServlet {
        private static final long serialVersionUID = 1L;
   
    public DashboardHTTP() {
        super();
      
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            HttpSession session=request.getSession(false);  
            String userId = null;
            if (session.getAttribute("userid") != null)
                userId =(String)session.getAttribute("userid");  
            if (userId == null ) {
                out.println("No UserId was found in session.<br>");
            } else {
                out.println("UserId obtained from session :" + userId + "<br>");
            }
            out.println("</body></html>");
        }

     
}
