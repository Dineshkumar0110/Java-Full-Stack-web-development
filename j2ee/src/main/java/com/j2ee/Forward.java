package com.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forward extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String un = req.getParameter("Username");
		PrintWriter out = resp.getWriter();
		out.print("Hello "+"un"+"from pg3");
		
		RequestDispatcher rd = req.getRequestDispatcher("Forward2");
		
		
		rd.include(req, resp);
	}
}
