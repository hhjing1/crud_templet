package com.util;

import java.util.HashMap;
import java.util.Map;

import com.model.User;

public class DBUtil {
	private static Map<String, User> db=new HashMap<String,User>();
     public static boolean addUser(String username,String password,String sex,int age) {
	  //TODO
	  if(db.containsKey(username)) {
		  return false;
	  }
	  else 
	  {
		  User user=new User(username,password,sex,age);
		  db.put(username,user);
		  return true;
	  }
  }
     //登陆校验
     public static User VerifyAccount(String username,String password) {
    	 if(db.containsKey(username)) {
    		 User user=db.get(username);
    		 if(user.getPassword().equals(password))
    		      return user;
    		 else 
    			 return null;
    	 }
    	 else {
			return null;
		}
     }
}
