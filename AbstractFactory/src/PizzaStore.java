
public abstract class PizzaStore {
	public abstract Pizza createPizza(String Pizza);
	
	public Pizza orderPizza(String type) {
		Pizza p=createPizza(type);
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		
		System.out.println("���� ���Խ��ϴ�"+p.toString()+"����");
		return p;
		
		
	}
}
