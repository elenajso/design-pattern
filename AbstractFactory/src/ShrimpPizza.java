
public class ShrimpPizza extends Pizza {
	PizzaIngredientFactory factory;
	
	//1. 생성 주입 
	public ShrimpPizza(PizzaIngredientFactory factory) {
		this.factory=factory;
		this.name=" shrimp";
	}
	//2. 필드 주입
	public void setFactory(PizzaIngredientFactory factory) {
		this.factory=factory;
	}
	
	
	@Override
	public void prepare() { //부산 서울에 따라서 변경 
		this.dough=factory.creatDough();//새우용도우
		this.cheese=factory.createCheese();//괄호안에 채워넣기 실제로 할때
		this.toppings.add(factory.createTopping());
		
	}

}
