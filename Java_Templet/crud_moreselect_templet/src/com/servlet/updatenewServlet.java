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
 * Servlet implementation class updatenewServlet
 */
@WebServlet("/updatenewServlet")
public class updatenewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		Bean beannew=new Bean();
		Dao dao=new Dao();
		beannew.setName(request.getParameter("updatename"));
		beannew.setSex(request.getParameter("updatesex"));
		beannew.setNation(request.getParameter("updatenation"));
		beannew.setTime(request.getParameter("updatetime"));
		beannew.setAge(Integer.parseInt(request.getParameter("updateage")));
		beannew.setKind(request.getParameter("updatekind"));
		beannew.setServe(request.getParameter("updateserve"));
		//System.out.println("���ܳɹ�");
		//System.out.println(request.getParameter("updatename"));
		//bean.setValue2(Integer.parseInt(request.getParameter("value2")));
		//bean.setValue3(Boolean.parseBoolean(request.getParameter("value3")));
          if(dao.update(beannew)) {
			//request.setAttribute("message", "添加成功");
		 	response.sendRedirect("index.jsp");
		}
		else {
			//request.setAttribute("message","添加失败");
			response.sendRedirect("update_show.jsp");
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
