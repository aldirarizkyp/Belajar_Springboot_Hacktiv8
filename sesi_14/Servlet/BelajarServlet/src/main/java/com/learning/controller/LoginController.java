package com.learning.controller;

import java.io.IOException;

import com.learning.model.Member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String err = "";
		int q = 0;
		if(username.equals("") || username == null)
		{
			err = "Username harus diisi";
		}
		else if(password.equals("") || password == null)
		{
			err = "Password harus diisi";
		}
		else
		{
			HttpSession session = request.getSession();
			RequestDispatcher rd = request.getRequestDispatcher("member.jsp");
			Member member = new Member();
			member.setUsername(username);
			member.setPassword(password);
			session.setAttribute("member", member);
			rd.forward(request,response);
			return;
		}
		if(q==0)
		{
			request.setAttribute("err", err);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);	
			return;
		}
	}
}

