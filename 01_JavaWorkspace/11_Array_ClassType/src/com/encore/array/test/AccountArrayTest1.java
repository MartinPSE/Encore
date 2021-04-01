package com.encore.array.test;

import com.encore.array.Account;


public class AccountArrayTest1 {

	public static void main(String[] args) {
		// 1. Account Type 의 배열을 생성... 사이즈는 3
		Account[] account = new Account[3];
		
		// 2. 각각의 칸에 신한, 국민 우리은행 통장을 생성
		account[0] = new Account(1000, "신한은행");
		account[1] = new Account(30000, "국민은행");
		account[2] = new Account(1000, "우리은행");
		
		// 3. for 문을 사용해서 각각의 Account 정보를 콘솔로 출력
		for (int i = 0 ; i<account.length ; i++)
			System.out.println(account[i].getDetail());

	}

}
