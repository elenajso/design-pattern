
public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore seoulStore=new SeoulPizzaStore();
		PizzaStore busanStore=new BusanPizzaStore();
		
		Pizza sPizza=seoulStore.orderPizza("货快");
		Pizza bPizza=busanStore.orderPizza("货快");
		

	}

}
