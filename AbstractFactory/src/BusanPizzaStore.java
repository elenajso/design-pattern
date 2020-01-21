
public class BusanPizzaStore extends PizzaStore {
	PizzaIngredientFactory factory;
	
	public BusanPizzaStore() {
		factory=new BusanPizzaIngredientFactory();
	}
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("����")) {
			pizza=new ShrimpPizza(factory);
		}
		return pizza;
	}

}
