package stram.object.step2.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UserInfoObejctInputTest2 {

	public static void main(String[] args) throws Exception {
		String FileName = "src\\userInfo.ser";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName));
		
		UserInfo user1 = (UserInfo) ois.readObject();
		UserInfo user2 = (UserInfo) ois.readObject();
		UserInfo user3 = (UserInfo) ois.readObject();
		//
		
		ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		//
		System.out.println(list);
		ois.close();
		
		
		

	}

}
