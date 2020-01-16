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
 * Servlet implementation class deleteServlet
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        
		Dao dao=new Dao();
		if(dao.delete(request.getParameter("delete"))) {
           //request.setAttribute("message鈥濓紝"鍒犻櫎鎴愬姛");
			//response.sendRedirect("index.jsp");
		
			request.setAttribute("message", "是否确认删除");
			request.getRequestDispatcher("delete.jsp").forward(request,response);
			//response.sendRedirect("index.jsp");
		}
		else {
			request.setAttribute("message", "删除失败");
			request.getRequestDispatcher("delete.jsp").forward(request,response);
			//response.sendRedirect("index.jsp");
			//request.setAttribute("message", "鍒犻櫎澶辫触,璇烽噸鏂拌繘琛屽垹闄�");
			//response.sendRedirect("delete.jsp");
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
