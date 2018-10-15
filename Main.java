package Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaMemDao a = new PizzaMemDao();
		a.findPizzaByCode(null);
		a.findPizzaByCode("FRO");
		Pizza pizza = new Pizza("CAN", "CANNIBALE", 9.20f);
		
		a.saveNewPizza(pizza);
		//a.findPizzaByCode();
		a.deletePizza("MAR");
		
	}

}
