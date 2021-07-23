package effecivejava;

import effecivejava.NyPizza.Size;
import effecivejava.Pizza.Topping;

public class PizzaTest {

	public static void main(String[] args) {

		Pizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE)
				.addTopping(Topping.ONION).build();

		
		Pizza calzone = new Calzone.Builder().addTopping(Topping.HAM).addTopping(Topping.PEPPER)
				.sauceInside().build();
		
		System.out.println(pizza);
		System.out.println(calzone);
	}

}
