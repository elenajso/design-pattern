import java.util.Scanner;

public class CoffeeMaker extends CaffeinMaker {

	protected boolean userWantCondiment() {
		System.out.println("�� �߰��ұ��?");
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
		System.out.println("���� �߰�");
		System.out.println("���� �߰�");
		
	}

	protected void brew() {
		System.out.println("Ŀ�ǳ�����");
		
	}
}
