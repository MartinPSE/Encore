package com.encore.dao;

import com.encore.vo.Stock;
import com.encore.vo.User;

public interface BrokerDAO {
	
	void registerMember(User user);
	void deleteMember(User user);
	void updateMember(User user);
	Stock findByPrice(int price);
		
	
	void printAllStock();
	void printAllUser();
	

}
