package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Bean;
import com.dao.Dao;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		Bean bean = new Bean();
		bean.setName(request.getParameter("name"));
		bean.setTeacher(request.getParameter("teacher"));
		bean.setClassroom(request.getParameter("classroom"));
		Dao dao = new Dao();
		if(dao.add(bean)) {
			
			request.setAttribute("message", "添加成功");
			request.getRequestDispatcher("add.jsp").forward(request,response);
			//response.sendRedirect("index.jsp");
		}
		else {
			request.setAttribute("message","添加失败");
			request.getRequestDispatcher("add.jsp").forward(request,response);
			//response.sendRedirect("add.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
