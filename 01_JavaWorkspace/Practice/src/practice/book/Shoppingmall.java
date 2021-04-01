package practice.book;

public class Shoppingmall {
	private String number;
	private String id;
	private String date;
	private String name;
	private String Info;
	private String address;
	
	
	
	
	public Shoppingmall(String number, String id, String date, String name, String info, String address) {
		super();
		this.number = number;
		this.id = id;
		this.date = date;
		this.name = name;
		Info = info;
		this.address = address;
	}




	public String getNumber() {
		return number;
	}




	public String getId() {
		return id;
	}




	public String getDate() {
		return date;
	}




	public String getName() {
		return name;
	}




	public String getInfo() {
		return Info;
	}




	public String getAddress() {
		return address;
	}




	public void setNumber(String number) {
		this.number = number;
	}




	public void setId(String id) {
		this.id = id;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setInfo(String info) {
		Info = info;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public static void main(String[] args) {
		Shoppingmall ID = new Shoppingmall("2018013120001","abc123","2018년 3월 12일","홍길순","PD0345-12",
				"서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문 번호 :" +ID.getNumber());
		System.out.println("주문자 아이디 : "+ID.getId());
		System.out.println("주문 날짜 : "+ID.getDate());
		System.out.println("주문자 이름 : "+ID.getId());
		System.out.println("주문 상품 번호 : "+ID.getInfo());
		System.out.println("배송 주소 : "+ID.getAddress());
		
		
		
		

	}

}
