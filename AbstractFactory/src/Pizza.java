import java.util.ArrayList;

public abstract class Pizza {

	protected String name;
	
	Dough dough;
	Cheese cheese;
	ArrayList<Topping> toppings=new ArrayList();
	
	public abstract void prepare();
	public void bake() {
		System.out.println("Baking"+name+" pizza");
		
	}
	
	public void cut() {
		System.out.println("Cutting"+name+" pizza");
	}
	
	public void box() {
		System.out.println("Boxing"+name+" pizza");
	}
	
	@Override
	public String toString() {

		return dough.toString()+cheese.toString()+toppings.toString();
	}
	
	
}
