package pizza.parent;


/*
 * 
 *  �߻� Ŭ������ �뵵
 *  1. ���������� ���ڸ� ������ ���� �������� �۾� (�ʵ�, Method) �� �״�� �ڽĵ鿡�� �����ְ�
 *  2. �ݸ鿡 ���������� ���ڰ� ����� �� �� �ִ� '�������� �κ�' --> �߻�Method�� �����صд�!!!
 *  								public abstract void topping();
 *  
 *  	�Ϻ��� �߻��� ----> Interface ---> ����ڿ� �ۼ��ڰ��� Contract
 
 *   	�κ����� �߻��� ---> Abstract ---> ���������� �ٸ� �κ��� �̿����� �����ش� --> �ڽ��� �ϼ�!!
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
		System.out.println("���� ���װ� �Բ� ���츦 �� ����� �ݴϴ�..");
	}
	
	public void bake() {
		System.out.println("���쿡 �� �����ݽô�.");

		
	}
	
	public void boxing() {
		System.out.println("����濡 ���� �ڽ� ����ó��..");
		
	}
	
	public void cutting () {
		System.out.println("8�������� �߶� �ݽô�.");
		
	}
	
	public abstract void topping();


	@Override
	public String toString() {
		return "�����̸� : " + storeName+" "+price+" ��";
	}
	
	
	


}
