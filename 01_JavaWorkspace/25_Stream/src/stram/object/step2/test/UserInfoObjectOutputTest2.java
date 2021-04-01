package stram.object.step2.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserInfoObjectOutputTest2 {

	public static void main(String[] args) throws Exception {
		String FileName = "src\\userInfo.ser";
		FileOutputStream fos = new FileOutputStream(FileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		UserInfo user1 = new UserInfo("강호동" , 46 , "2424");
		UserInfo user2 = new UserInfo("이수근" , 35 , "3636");
		UserInfo user3 = new UserInfo();
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(user1); list.add(user2); list.add(user3);
		
		// 직렬화 ( 즉, 객체를 던질때 직렬화가 진행되는거야 )
		oos.writeObject(user1);
		oos.writeObject(user2);
		oos.writeObject(user3);
		//
		oos.writeObject(list);
		
		oos.close();
		System.out.println("직렬화 작업이 끝났습니다.");
	
		

	}

}
