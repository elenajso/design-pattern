package samsung.devices;

public class DVDPlayer {

	private int volume;
	
	public void play() {
		System.out.println("DVD�÷��̾� �÷��� ����");
	}
	public void stop() {
		System.out.println("DVD�÷��̾� ����");
	}
	
	public void setVolume(int v) {
		this.volume=v;
		System.out.println(v);
	}
	
	
}