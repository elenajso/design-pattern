
public class SeoulPizzaStore extends PizzaStore {
	PizzaIngredientFactory factory;
	
	public SeoulPizzaStore() {
		factory=new SeoulPizzaIngredientFactory();
	}//정적 초기화 
	
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("새우")) {
			pizza=new ShrimpPizza(factory);
		}
		return pizza;
	}

}
