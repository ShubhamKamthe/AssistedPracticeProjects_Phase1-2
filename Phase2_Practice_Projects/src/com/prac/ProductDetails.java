package com.prac;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Servlet implementation class ProductDetails
 */
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();        

         String id=request.getParameter("ID"); 
         try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

         try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from eproduct where ID=?");
			ps.setString(1,id);        
			out.print("<table>");
			out.print("<center><h1>Result:</h1></center>");
			ResultSet rs=ps.executeQuery();                

              /* Printing column names */

            ResultSetMetaData rsmd=rs.getMetaData();
            
            while(rs.next()){
            out.print("<tr>");
            out.print("<td>"+rsmd.getColumnName(1)+"</td>");
            out.print("<td>"+rs.getString(1)+"</td></tr>");
            out.print("<tr><td>"+rsmd.getColumnName(2)+"</td>");
            out.print("<td>"+rs.getString(2)+"</td></tr>");
            out.print("<tr><td>"+rsmd.getColumnName(3)+"</td>");
            out.print("<td>"+rs.getString(3)+"</td></tr>");
            out.print("<tr><td>"+rsmd.getColumnName(4)+"</td>");
            out.print("<td>"+rs.getString(4)+"</td></tr>");                  
         }
         out.print("</table>");
         ps.close();
         con.close();
  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}