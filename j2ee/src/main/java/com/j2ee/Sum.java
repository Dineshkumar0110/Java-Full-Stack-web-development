package com.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		
		
		int sum = x+y;
		
		req.setAttribute("mysum", sum);
	   RequestDispatcher rd = req.getRequestDispatcher("callproduct");
	   rd.forward(req, resp);
		
	}
}
