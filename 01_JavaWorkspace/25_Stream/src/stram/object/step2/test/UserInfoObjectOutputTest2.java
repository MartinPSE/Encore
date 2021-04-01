package stram.object.step2.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserInfoObjectOutputTest2 {

	public static void main(String[] args) throws Exception {
		String FileName = "src\\userInfo.ser";
		FileOutputStream fos = new FileOutputStream(FileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		UserInfo user1 = new UserInfo("��ȣ��" , 46 , "2424");
		UserInfo user2 = new UserInfo("�̼���" , 35 , "3636");
		UserInfo user3 = new UserInfo();
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(user1); list.add(user2); list.add(user3);
		
		// ����ȭ ( ��, ��ü�� ������ ����ȭ�� ����Ǵ°ž� )
		oos.writeObject(user1);
		oos.writeObject(user2);
		oos.writeObject(user3);
		//
		oos.writeObject(list);
		
		oos.close();
		System.out.println("����ȭ �۾��� �������ϴ�.");
	
		

	}

}
