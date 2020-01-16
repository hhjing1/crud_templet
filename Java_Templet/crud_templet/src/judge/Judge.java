package judge;

import java.util.HashMap;
import java.util.Map;

import com.bean.Bean;

public class Judge {

	private static Map<String,Bean> db=new HashMap<String, Bean>();
	public static boolean add(String name,String teacher,String classroom) {
		if(db.containsKey(name)) {
			return false;
		}
		else {
			Bean bean=new Bean(name,teacher,classroom);
			db.put(name,bean);
			 //User user=new User(username,password,sex,age);
			  //db.put(username,user);
			  return true;
		}
	}
}
