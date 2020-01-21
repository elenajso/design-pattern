package Menu;

public class MenuItem extends MenuComponent {
//add menucomponent는 부모에게 맞길거니까 abstract 지우기 
	
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
	public void print() { //메뉴아이템 출력
		System.out.print(getName());
		if(isVeg()){
			System.out.println("(채식)");
		} else{
			System.out.println();
		}
		
		System.out.println(getDescription());
		System.out.println(getPrice());

	}

}
