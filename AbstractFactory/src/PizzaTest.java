
public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore seoulStore=new SeoulPizzaStore();
		PizzaStore busanStore=new BusanPizzaStore();
		
		Pizza sPizza=seoulStore.orderPizza("����");
		Pizza bPizza=busanStore.orderPizza("����");
		

	}

}
