package com.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Block extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		HttpSession session = req.getSession();
//		String name = (String)session.getAttribute("un");
		
		
		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();
		for (Cookie cookie : cookies) {
			
			out.println(cookie.getName() + ": " +cookie.getValue());
			
		}
		
		
		
//		out.println("hey "+ name);
		out.println("your are blocked. please contact the admin.");
	}
}
