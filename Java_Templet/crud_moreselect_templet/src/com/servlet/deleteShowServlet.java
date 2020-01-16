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
 * Servlet implementation class deleteShowServlet
 */
@WebServlet("/deleteShowServlet")
public class deleteShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Bean bean=new Bean();
		bean.setName(request.getParameter("delete"));
		Dao dao=new Dao();
		bean = dao.selectName(bean.getName());
		if(bean!=null)
		{
			request.setAttribute("Bean",bean);
			request.getRequestDispatcher("delete_show.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("message","无此信息");
			request.getRequestDispatcher("delete.jsp").forward(request,response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
