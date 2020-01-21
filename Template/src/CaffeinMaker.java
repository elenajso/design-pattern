
public abstract class CaffeinMaker {

	public CaffeinMaker() {
		super();
	}

	//public abstract void prepare();

	public void prepare() { //abstract가 아니고 구상클래스로 바뀜
		boilWater();
		brew();
		pourInCup();
		if(userWantCondiment()) {
			addCondiment();
	}
	}
	
	//훅 메소드--없어도 되지만  안만들어넣으면 false로 자동지정
	protected boolean userWantCondiment() {//자식에서 쓰게하려면 protected로 적어줘야함
		// TODO Auto-generated method stub
		return true;
	}

	protected abstract void addCondiment();
	//자식클래스에서 addCondiment 에서 안쓰게하려면 if문에서 false로 묶어준다
	
	protected abstract void brew();

	protected void pourInCup() {
		System.out.println("컵에 붓기");
		
	}

	protected void boilWater() {
		System.out.println("물끓이기");
		
	}

}