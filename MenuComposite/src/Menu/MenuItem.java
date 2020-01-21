package Menu;

public class MenuItem extends MenuComponent {
//add menucomponent�� �θ𿡰� �±�Ŵϱ� abstract ����� 
	
	private String name;
	private String description;
	private double price;
	private boolean veg;
	
	
	public MenuItem(String name, String description, boolean veg, double price){
		this.description=description;
		this.name=name;
		this.price=price;
		this.veg=veg;
	}
	


	public String getName() {
		return name;
	}



	public String getDescription() {
		return description;
	}



	public double getPrice() {
		return price;
	}



	public boolean isVeg() {
		return veg;
	}



	@Override
	public void print() { //�޴������� ���
		System.out.print(getName());
		if(isVeg()){
			System.out.println("(ä��)");
		} else{
			System.out.println();
		}
		
		System.out.println(getDescription());
		System.out.println(getPrice());

	}

}
