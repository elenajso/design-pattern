
public class CaffeinTestDrive {

	public static void main(String[] args) {
//		CaffeinMaker cm=new CoffeeMaker();
//		cm.prepare();
//		
//		TeaMAker tm=new TeaMAker();
//		tm.prepare();
		
		CaffeinMaker coffeeMaker=new CoffeeMaker();
		CaffeinMaker teaMaker=new TeaMAker();
		
		coffeeMaker.prepare();
		teaMaker.prepare();
		
	}
		
}
