package pizza.test;

import pizza.child.BulgogiPizza;
import pizza.child.HawianPIzza;
import pizza.child.PotatoPizza;
import pizza.parent.Pizza;
import pizza.service.impl.PizzaServiceImpl;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new BulgogiPizza(15000, "Mr.Pizza");
		Pizza p2 = new HawianPIzza(17000, "¾ßÈ£");
		Pizza p3 = new PotatoPizza(20000, "PizzaEttang");
		
		
		Pizza[] pizzas = {p1,p2,p3};
		
		PizzaServiceImpl.getInstance().allMakePizza(pizzas);
		
}
}

