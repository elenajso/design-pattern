package command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("�� ��ư�Դϴ�.");
	//	throw new NoSuchCommandException(); try catch ��ߵ�

	}

}
