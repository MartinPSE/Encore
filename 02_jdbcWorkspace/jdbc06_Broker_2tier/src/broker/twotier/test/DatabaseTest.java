package broker.twotier.test;

import java.util.Vector;

import broker.twotier.dao.Database;
import broker.twotier.vo.SharesRec;

public class DatabaseTest {

	public static void main(String[] args) throws Exception {
		
		Database db = new Database("127.0.0.1");
//		db.updateCustomer(new CustomerRec("111-111","하바리","약수동"));
		
//		db.deleteCustomer("111-119");

//		Vector<SharesRec> v = db.getPortfolio("111-119");
//		for (SharesRec sr : v ) System.out.println(sr);

//		db.sellShares("111-119", "DUKE", 50);
//		db.sellShares("111-118","DUKE",40);
		
	}
}
