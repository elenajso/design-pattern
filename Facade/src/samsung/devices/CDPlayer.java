package samsung.devices;

public class CDPlayer {

	private int volume;
	
	public void play() {
		System.out.println("CD�÷��̾� �÷��� ����");
	}
	
	public void stop() {
		System.out.println("CD �÷��̾� ����");
	}
	
	public void setVolume(int v) {
		this.volume=v;
	}
}
