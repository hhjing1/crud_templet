package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DB;
import com.servlet.selectNameServlet;
import com.servlet.updateServlet;
import com.db.DB;
import com.bean.Bean;

public class Dao {
	
	//增加
	@SuppressWarnings("static-access")
	public boolean add(Bean bean) {
		String tablename = "test";
		DB db=new DB();
		Connection con = db.getCon();
		
		try {
			String sql="insert into "+tablename+"(name,teacher,classroom) values ('"+bean.getName()+"','"+bean.getTeacher()+"','"+bean.getClassroom()+"')";
			Statement stm = con.createStatement();
			System.out.println(sql);
			stm.execute(sql);
			db.close(stm, con);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("add false");
			return false;
		}
		System.out.println("add true");
		return true;
	}

	//根据名称进行查询
	@SuppressWarnings("static-access")
	public static Bean selectName(String name) {
		String tablename = "test";
		System.out.println("select bean where name = "+name);
		Bean bean=null;
		DB db=new DB();
		Connection con = db.getCon();
		try {
			Statement stm = con.createStatement();
			//閿熸枻鎷烽敓鏂ゆ嫹value1=name閿熸枻鎷烽敓鏂ゆ嫹閿熸嵎锝忔嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓琛楄鎷烽敓鏂ゆ嫹閿熸枻鎷�
			ResultSet rs = stm.executeQuery("select * from "+tablename+" where name='" + name + "'");
			/*
			 * 閿熸枻鎷烽敓鏂ゆ嫹value1=name閿熸枻鎷烽敓鏂ゆ嫹閿熸嵎锝忔嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹value3閿熸枻鎷烽敓琛楄鎷烽敓鏂ゆ嫹閿熸枻鎷�
			 * ResultSet rs =stm.executeQuery("select value3 from "+tablename+" where value2="+i);
			 */
			if(rs.next())
			{
				bean = new Bean();
				System.out.println("select the bean from mysql");
				bean.setName(rs.getString("name"));
				bean.setTeacher(rs.getString("teacher"));
				bean.setClassroom(rs.getString("classroom"));
				//bean.setValue2(Integer.parseInt(rs.getString("teacher")));
		    	//bean.setValue3(Boolean.parseBoolean(rs.getString("address")));
				System.out.println("name of the bean is "+rs.getString("name"));
			}
			db.close(rs,stm, con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	
	//删除
	@SuppressWarnings("static-access")
	public static boolean delete(String name)
	{
		//String tablename ="test";
		DB db=new DB();
		Connection con = db.getCon();
		//Connection con=null;
		PreparedStatement stm=null;
		try {
			con=DB.getCon();
			String sql="delete from test where name='"+name+"'";
			//String sql="delete from test where name='"+bean.getName()+"'";
			System.out.println(sql);
			stm=con.prepareStatement(sql);
			stm.executeUpdate();
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			db.close(stm, con);
		}
		return false;
	}
   //修改
	@SuppressWarnings("static-access")
	public boolean update(Bean bean) {
		Connection con=null;
		PreparedStatement stm=null;
		String tablename="test";
		DB db=new DB();
		try {
			con=DB.getCon();
			String sql="update "+tablename+" set teacher=?,classroom=? where name=?";
			//String sql="update "+tablename+"set teacher=?,classroom=? where name=?";
			stm=con.prepareStatement(sql);
			stm.setString(3,bean.getName());
			stm.setString(1, bean.getTeacher());
			stm.setString(2,bean.getClassroom());
			stm.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		finally {
			db.close(stm, con);
			return true;
		}
	}
  //根据名字进行查找
	 public  boolean findName(String name){
	    	boolean flag=false;//鎵句笉鍒�
	    	Connection con=null;
			PreparedStatement psts=null;
			ResultSet rs=null;
			String tablename="test";
			DB db=new DB();
			try {
				con=db.getCon();
				String sql="select * from"+tablename+" where name=?";
				psts=con.prepareStatement(sql);
				psts.setString(1, name);
				rs=psts.executeQuery();
				while(rs.next()){
					flag=true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return flag;
	 }
	
	//
	@SuppressWarnings("static-access")
	 public ArrayList<Bean> selectList(){
    	Connection con=null;
		PreparedStatement stm=null;
		ResultSet rs=null;
		ArrayList<Bean> listbean=new ArrayList<Bean>();
		String tablename="test";
		DB db=new DB();
		try {
			con=db.getCon();
			String sql="select * from "+tablename;
			stm=con.prepareStatement(sql);
			rs=stm.executeQuery();
			while(rs.next()){
			
				String name=rs.getString("name");
				String teacher=rs.getString("teacher");
				String classroom=rs.getString("classroom");
				Bean bean=new Bean(name,teacher,classroom);
				listbean.add(bean);
				
			}
		} 
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			db.close(stm, con);
		}
		return listbean;
    }

}

	
	//
//	public Bean login(String name,String password) {
//		String tablename = null;
//		DB db=new DB();
//		Connection con = db.getCon();
//		Bean bean = null;
//		try {
//			Statement stm = con.createStatement();
//			ResultSet rs = stm.executeQuery("select * from "+tablename+" where value1='" + name + "'");
//			if(rs.next()) {
//				if (rs.getString("password").equals(password)) {
//					
//				}
//			}
//		}catch(Exception e) {
//			
//		}
//	}
	

