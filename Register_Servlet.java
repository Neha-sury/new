package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.dao.StudentDao;
import com.entity.Student;

  /**
    * Servlet implementation class Register_Servlet
   */
    public class Register_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		String city=request.getParameter("city");
		String contact=request.getParameter("contact");
		
		Student s = new Student(id,name,username,password,city,contact);
		
		try {
		     int result =StudentDao.register(s);
		     
		     if(result>0)
		     {
		    	 response.sendRedirect("login.jsp");
		     }
		     else
		     {
		    	 response.sendRedirect("error.jsp");
		     }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
