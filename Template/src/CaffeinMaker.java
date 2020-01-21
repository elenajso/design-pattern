
public abstract class CaffeinMaker {

	public CaffeinMaker() {
		super();
	}

	//public abstract void prepare();

	public void prepare() { //abstract�� �ƴϰ� ����Ŭ������ �ٲ�
		boilWater();
		brew();
		pourInCup();
		if(userWantCondiment()) {
			addCondiment();
	}
	}
	
	//�� �޼ҵ�--��� ������  �ȸ��������� false�� �ڵ�����
	protected boolean userWantCondiment() {//�ڽĿ��� �����Ϸ��� protected�� ���������
		// TODO Auto-generated method stub
		return true;
	}

	protected abstract void addCondiment();
	//�ڽ�Ŭ�������� addCondiment ���� �Ⱦ����Ϸ��� if������ false�� �����ش�
	
	protected abstract void brew();

	protected void pourInCup() {
		System.out.println("�ſ� �ױ�");
		
	}

	protected void boilWater() {
		System.out.println("�����̱�");
		
	}

}