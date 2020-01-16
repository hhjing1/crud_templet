package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Bean;
import com.dao.Dao;

/**
 * Servlet implementation class VagueServlet
 */
@WebServlet("/VagueServlet")
public class VagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VagueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
        
        
        
        Dao dao=new Dao();
		java.util.List<Bean> list= new ArrayList<Bean>();
		String p[] = new String[5];
    	String s[] = new String[5];
    	String g[] = new String[5];
    	String f[] = new String[5];
    	String number = null;

    	//String number1 = null;
    	number=request.getParameter("number1");
    	//number1=request.getParameter("number2");
    	int n = Integer.parseInt(number);//鎺ユ敹鏉′欢鐨勪釜鏁�
    	System.out.println("鏉′欢鏁�"+n); 
    	for(int i=1;i<=n;i++)
    	{
    		p[i]= (String) request.getParameter("s"+i);
    		s[i]=(String)request.getParameter("shuru"+i);
    		f[i]=(String)request.getParameter("c"+i);
    		System.out.println("绮剧‘杩樻槸妯＄硦"+f[i]);
    		System.out.println("鏉′欢"+p[i]);
    		System.out.println("杈撳叆"+s[i]);
    		if(p[i].equals("鍚嶅瓧")){
    			p[i] = "name";
    		}else if(p[i].equals("姓名")){
    			p[i] = "sex";
    		}else if(p[i].equals("民族")){
    			p[i] = "nation";
    		}else if(p[i].equals("时间")){
    			p[i] = "time";
    		}else if(p[i].equals("年龄")){
    			p[i] = "age";
    		}
    		
    		
    		
    	}
    	
    	for(int i=1;i<n;i++)
    	{
    		g[i]=(String) request.getParameter("g"+i);
    		if(g[i].equals("涓�")) {
    			g[i]="and";
    		}else if(g[i].equals("鎴�")) {
    			g[i]="or";
    		}
    		System.out.println("涓旀垨"+g[i]);
    	}
    	
    	String sql="where ";
    	for(int i=1;i<n;i++)
    	{
    		if(s[i].equals(""))
    		{
    			continue;
    		}
    		if(f[i].equals("绮剧‘"))
    		{
    			sql=sql+p[i]+"='"+s[i]+"'"+" "+g[i]+" ";
    		}else if(f[i].equals("妯＄硦"))
    		{
    			sql=sql+p[i]+" "+"LIKE"+" "+"'%"+s[i]+"%'"+" "+g[i]+" ";
    		}
    		
    	}
    	if(f[n].equals("绮剧‘")) {
    		sql = sql + p[n]+"="+"'"+s[n]+"'";	
    	}else {
    		sql = sql + p[n]+" "+"LIKE"+" "+"'%"+s[n]+"%'";	
    	}
//	}
    	if(n==1&&s[1].equals(""))
    	{
    		System.out.println("浠�涔堜篃娌′紶锛�");
    		sql="";
    	}
    	list = dao.loadview(sql);
	    	
	    	if(list.size()!=0) {
	    	request.setAttribute("course11",list); 
			request.setAttribute("message", "查找成功");
			System.out.print("鏌ヨ 鎴愬姛");
			request.getRequestDispatcher("selectmore_show.jsp").forward(request,response);
	    	}
	    	else {
	    		request.setAttribute("message", "查找失败");
	    		request.getRequestDispatcher("select.jsp").forward(request,response);
	    	}
//    	HttpSession session = request.getSession();
//		session.setAttribute("tiaojian", list);
////	    	int servletid=1;
////    		request.setAttribute("list", list);
////    		request.setAttribute("servletid", servletid);
//    	try {
////    		request.getRequestDispatcher("/admin/123.jsp").forward(request, response);
//			response.sendRedirect(request.getContextPath()+"/show.jsp");
//		} catch (IOException e) {
//			// TODO  远    傻  catch   
//			e.printStackTrace();
//		} 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
