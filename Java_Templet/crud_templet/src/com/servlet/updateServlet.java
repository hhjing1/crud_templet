package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Bean;
import com.dao.Dao;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		Bean bean=new Bean();
		Bean beanform=new Bean();
		Dao dao=new Dao();
		bean = dao.selectName(request.getParameter("selectname"));
     	System.out.println(request.getParameter("selectname"));
		if(bean!=null)
		{
			request.setAttribute("Bean",bean);
			request.getRequestDispatcher("update_show.jsp").forward(request,response);
		}
		
//		else if(bean==null) {
//			request.setAttribute("Bean",bean);
//			request.getRequestDispatcher("delete.jsp").forward(request,response);
//			return ;
//		}
			
		
	
//		beanform.setName(request.getParameter("updatename"));
//		beanform.setTeacher(request.getParameter("updateteacher"));
//		beanform.setClassroom(request.getParameter("updateclassroom"));
//		 //bean.setValue2(Integer.parseInt(request.getParameter("value2")));
//		 //bean.setValue3(Boolean.parseBoolean(request.getParameter("value3")));
//          if(dao.update(beanform)) {
//			//request.setAttribute("message", "添加成功");
//		 	response.sendRedirect("index.jsp");
//		}
//		else {
//			//request.setAttribute("message","添加失败");
//			response.sendRedirect("update.jsp");
//		}
	}

}
