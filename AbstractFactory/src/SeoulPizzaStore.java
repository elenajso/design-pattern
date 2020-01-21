
public class SeoulPizzaStore extends PizzaStore {
	PizzaIngredientFactory factory;
	
	public SeoulPizzaStore() {
		factory=new SeoulPizzaIngredientFactory();
	}//���� �ʱ�ȭ 
	
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("����")) {
			pizza=new ShrimpPizza(factory);
		}
		return pizza;
	}

}
