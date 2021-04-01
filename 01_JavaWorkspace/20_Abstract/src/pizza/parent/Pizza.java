package pizza.parent;


/*
 * 
 *  추상 클래스의 용도
 *  1. 여러종류의 피자를 만들어내기 위한 공통적인 작업 (필드, Method) 은 그대로 자식들에게 물려주고
 *  2. 반면에 여러종류의 피자가 만들어 질 수 있는 '결정적인 부분' --> 추상Method로 선언해둔다!!!
 *  								public abstract void topping();
 *  
 *  	완벽한 추상성은 ----> Interface ---> 사용자와 작성자간의 Contract
 
 *   	부분적인 추상성은 ---> Abstract ---> 결정적으로 다른 부분을 미완으로 물려준다 --> 자식이 완성!!
 *  
 */


public abstract class Pizza {
	protected int price;
	protected String storeName;
	public static final int DEFAULT_PRICE = 14000;
	public static final String DEFAULT_STORENAME = "PizzaHut";
	
	
	
	public Pizza(int price, String storeName) {
		super();
		this.price = price;
		this.storeName = storeName;
	}
	
	
	public Pizza() {
		this(DEFAULT_PRICE, DEFAULT_STORENAME);
	}
	
	public void makePizza() {
		dough();
		
		topping();
		
		bake();
		cutting();
		boxing();
	}
	
	
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 잘 만들어 줍니다..");
	}
	
	public void bake() {
		System.out.println("오븐에 잘 구워줍시다.");

		
	}
	
	public void boxing() {
		System.out.println("기생충에 피자 박스 포장처럼..");
		
	}
	
	public void cutting () {
		System.out.println("8조각으로 잘라 줍시다.");
		
	}
	
	public abstract void topping();


	@Override
	public String toString() {
		return "상점이름 : " + storeName+" "+price+" 원";
	}
	
	
	


}
