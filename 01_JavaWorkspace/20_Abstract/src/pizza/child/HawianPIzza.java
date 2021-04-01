package pizza.child;

import pizza.parent.Pizza;

public class HawianPIzza extends Pizza{
	
	
	
	

	public HawianPIzza(int price, String storeName) {
		super(price, storeName);
	}

	public void topping() {
		System.out.println("Hawian Topping... pizza");
	}

}
