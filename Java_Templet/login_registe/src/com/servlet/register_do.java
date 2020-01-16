package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DBUtil;

/**
 * Servlet implementation class register_do
 */
@WebServlet("/register_do")
public class register_do extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 //String username=new String(request.getParameter("username").getBytes("iso-8859-1"),"utf-8");
		 //String password=new String(request.getParameter("password").getBytes("iso-8859-1"),"utf-8");
		 String sex=new String(request.getParameter("sex").getBytes("iso-8859-1"),"utf-8");
		 int age=Integer.parseInt(request.getParameter("age"));
		 boolean isSuccess=DBUtil.addUser(username,password,sex,age);
		  if(isSuccess){
			  request.setAttribute("message","注册成功，请登录！");
			  request.getRequestDispatcher("login.jsp").forward(request,response);
		  }
		  else{
			  request.setAttribute("message","注册失败，用户名重复，请重新注册！");
			  request.getRequestDispatcher("register.jsp").forward(request,response);
		  }
	}

}
