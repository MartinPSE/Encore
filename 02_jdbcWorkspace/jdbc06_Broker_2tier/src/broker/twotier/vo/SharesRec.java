package broker.twotier.vo;

/**
 * 
 *  * @author 오형석
 * 
 * 	누가 ( WHO )
 *  어떤 주식을 ( WHAT )
 *  얼마만큼 ( HOW ) 보유하고 있는지의 정보를 담고 있는 Class.	
 *
 */

public class SharesRec {
	
	private String ssn;
	private String symbol;
	private int quantity;
	
	public SharesRec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SharesRec(String ssn, String symbol, int quantity) {
		super();
		this.ssn = ssn;
		this.symbol = symbol;
		this.quantity = quantity;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "SharesRec [ssn=" + ssn + ", symbol=" + symbol + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	

}
