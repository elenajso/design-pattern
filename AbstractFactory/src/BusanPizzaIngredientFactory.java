
public class BusanPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Dough creatDough() {
		// TODO Auto-generated method stub
		return new ThinDough();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new CheddarCheese();
	}

	@Override
	public Topping createTopping() {
		// TODO Auto-generated method stub
		return new FrozenShrimp();
	}

}
