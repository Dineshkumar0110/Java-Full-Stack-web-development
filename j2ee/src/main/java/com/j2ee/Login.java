package com.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/login")
public class Login extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usename = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println(" Hello "+usename+ ",welcome to home page");
		resp.getWriter().println("Login Successful");
		PrintWriter out = resp.getWriter();
		out.println(" Hello "+usename+ ",welcome to home page (post)");
		
	}
	static int count =3;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usename = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		HttpSession session = req.getSession();
		session.setAttribute("un", usename);
		
		Cookie cookie = new Cookie("un", usename);
		resp.addCookie(cookie);
		
		
		
		if (password.equals("BTM@123") )
		{
			out.println(" Hello "+usename+ ",welcome to home page ");
		}
		else if (count > 0) {
			
			out.println(" Wrong password. " + count  +" attempts left ");
			count--;
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
			
		}else {
			resp.sendRedirect("block");
			RequestDispatcher rd = req.getRequestDispatcher("block");
			rd.forward(req, resp);
		}
		
//		System.out.println(" Hello "+usename+ ",welcome to home page");
//		resp.getWriter().println("Login Successful");
//		PrintWriter out = resp.getWriter();
//		out.println(" Hello "+usename+ ",welcome to home page");
		
	}

	
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

}
