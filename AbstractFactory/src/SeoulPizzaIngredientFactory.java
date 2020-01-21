
public class SeoulPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Dough creatDough() {
		// TODO Auto-generated method stub
		return new StandardDough();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

	@Override
	public Topping createTopping() {
		// TODO Auto-generated method stub
		return new Shrimp();
	}

}
