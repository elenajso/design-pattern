package command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("빈 버튼입니다.");
	//	throw new NoSuchCommandException(); try catch 써야됨

	}

}
