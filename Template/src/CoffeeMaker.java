import java.util.Scanner;

public class CoffeeMaker extends CaffeinMaker {

	protected boolean userWantCondiment() {
		System.out.println("뭐 추가할까요?");
		Scanner scanner=new Scanner(System.in);
		String msg = scanner.nextLine();
		if(msg.startsWith("y")) {
			return true;
		}else {
			return false;
		}
		//return false; 
	}
	
	protected void addCondiment() {
		System.out.println("우유 추가");
		System.out.println("설탕 추가");
		
	}

	protected void brew() {
		System.out.println("커피내리기");
		
	}
}
