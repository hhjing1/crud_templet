package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DB;
import com.db.DB;
import com.bean.Bean;

public class Dao {
	
	//增加
//	@SuppressWarnings("static-access")
//	public boolean add(Bean bean) {
//		String tablename = "test";
//		DB db=new DB();
//		Connection con = db.getCon();
//		
//		try {
//			String sql="insert into "+tablename+"(name,sex,nation,time,age,kind,serve) values ('"+bean.getName()+"','"+bean.getSex()+"','"+bean.getNation()+"','"+bean.getTime()+"','"+bean.getAge()+"','"+bean.getKind()+"','"+bean.getServe()+")";
//			Statement stm = con.createStatement();
//			System.out.println(sql);
//			stm.execute(sql);
//			db.close(stm, con);
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("add false");
//			return false;
//		}
//		System.out.println("add true");
//		return true;
//	}

	//增加
		@SuppressWarnings("static-access")
		public boolean add(Bean bean) {
			String tablename = "test1";
			DB db=new DB();
			Connection con = db.getCon();
			
			try {
				String sql="insert into "+tablename+"(name,sex,nation,time,age,kind,serve) values ('"+bean.getName()+"','"+bean.getSex()+"','"+bean.getNation()+"','"+bean.getTime()+"','"+bean.getAge()+"','"+bean.getKind()+"','"+bean.getServe()+"')";
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
		String tablename = "test1";
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
				bean.setSex(rs.getString("sex"));
				bean.setNation(rs.getString("nation"));
				bean.setTime(rs.getString("time"));
				bean.setAge(Integer.parseInt(rs.getString("age")));
				bean.setKind(rs.getString("kind"));
				bean.setServe(rs.getString("serve"));
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
		//String tablename ="test1";
		DB db=new DB();
		Connection con = db.getCon();
		//Connection con=null;
		PreparedStatement stm=null;
		try {
			con=DB.getCon();
			String sql="delete from test1 where name='"+name+"'";
			//String sql="delete from test where name='"+bean.getName()+"'";
			System.out.println(sql);
			System.out.println(name);
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
		String tablename="test1";
		DB db=new DB();
		try {
			con=DB.getCon();
			String sql="update "+tablename+" set sex=?,nation=?,time=?,age=?,kind=?,serve=? where name=?";
			//String sql="update "+tablename+" set teacher=?,classroom=? where name=?";
			//String sql="update "+tablename+"set teacher=?,classroom=? where name=?";
			stm=con.prepareStatement(sql);
			stm.setString(1,bean.getSex());
			stm.setString(2,bean.getNation());
			stm.setString(3,bean.getTime());
			stm.setInt(4,bean.getAge());
			stm.setString(5,bean.getKind());
			stm.setString(6,bean.getServe());
			stm.setString(7,bean.getName());
			
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
			String tablename="test1";
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
		String tablename="test1";
		DB db=new DB();
		try {
			con=db.getCon();
			String sql="select * from "+tablename;
			stm=con.prepareStatement(sql);
			rs=stm.executeQuery();
			while(rs.next()){
			
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				String nation=rs.getString("nation");
				String time=rs.getString("time");
				int age=rs.getInt("age");
				String kind=rs.getString("kind");
				String serve=rs.getString("serve");
//				String teacher=rs.getString("teacher");
//				String classroom=rs.getString("classroom");
				//Bean bean=new Bean(name,teacher,classroom);
			    Bean bean=new Bean(name,sex,nation,time,age,kind,serve);
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
	
	
	
	
	
	
	public static List<Bean> loadview(String sql) {
		// TODO Auto-generated method stub
		System.out.println("loadview的sql:"+sql);
		String sql1="select * from test1 "+ sql;
		System.out.println("loadview的sql1:"+sql1);
		List<Bean> list =new ArrayList<Bean>();
		
		
		
		Connection con=null;
		PreparedStatement psts=null;
		ResultSet rs=null;
		
		Bean yi=null;
			try 
			{
				con=DB.getCon();
				//String sql="select * from course";
				psts=con.prepareStatement(sql1);
				rs=psts.executeQuery();//记录返回的结果
				while(rs.next()) 
				{
				
					String name=rs.getString("name");
					String sex=rs.getString("sex");
					String nation=rs.getString("nation");
					String time=rs.getString("time");
					String kind=rs.getString("kind");
					String serve=rs.getString("serve");
					int age=rs.getInt("age");
					
					
					System.out.println("name"+name);
				 
					yi=new Bean(name,sex,nation,time,age,kind,serve);
					list.add(yi);
					System.out.println("name1"+yi.getName());
				}
			
				//db.close(rs, psts, con);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} 

		return list;
	}
		//return null;


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
	

