
public abstract class PizzaStore {
	public abstract Pizza createPizza(String Pizza);
	
	public Pizza orderPizza(String type) {
		Pizza p=createPizza(type);
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		
		System.out.println("피자 나왔습니다"+p.toString()+"피자");
		return p;
		
		
	}
}
