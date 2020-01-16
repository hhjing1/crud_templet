package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.util.DBUtil;

/**
 * Servlet implementation class login_do
 */
@WebServlet("/login_do")
public class login_do extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		User user=DBUtil.VerifyAccount(username, password);
		if(user==null)
		{
			//out.println("登录失败，用户名或密码错误！");
		  request.setAttribute("message", "<font color='red'>登录失败，用户名或密码错误</font>");
		  request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		else
		{
			 int number=0;
			 ServletContext application=this.getServletContext();
			  if(application.getAttribute("usernumber")!=null)
			  {
				  number=(Integer)application.getAttribute("usernumber");
			  }
			  number++;
			  application.setAttribute("username",number);
			//out.println("登录成功");
		request.setAttribute("user", user);
		request.getRequestDispatcher("personCenter.jsp").forward(request, response);
		}
	}
}
