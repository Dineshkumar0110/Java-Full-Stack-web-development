package com.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Program1 extends HttpServlet {

	 @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String un = req.getParameter("username");
	        PrintWriter out = resp.getWriter();
	        
	        // Add extra spaces before and after "alex"
	        out.print("Hello   " + un); 
	        
	        
	    }
}
