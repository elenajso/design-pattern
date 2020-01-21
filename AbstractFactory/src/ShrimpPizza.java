
public class ShrimpPizza extends Pizza {
	PizzaIngredientFactory factory;
	
	//1. ���� ���� 
	public ShrimpPizza(PizzaIngredientFactory factory) {
		this.factory=factory;
		this.name=" shrimp";
	}
	//2. �ʵ� ����
	public void setFactory(PizzaIngredientFactory factory) {
		this.factory=factory;
	}
	
	
	@Override
	public void prepare() { //�λ� ���￡ ���� ���� 
		this.dough=factory.creatDough();//����뵵��
		this.cheese=factory.createCheese();//��ȣ�ȿ� ä���ֱ� ������ �Ҷ�
		this.toppings.add(factory.createTopping());
		
	}

}
