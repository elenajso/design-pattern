package samsung.devices;

public class DVDPlayer {

	private int volume;
	
	public void play() {
		System.out.println("DVD플레이어 플레이 시작");
	}
	public void stop() {
		System.out.println("DVD플레이어 정지");
	}
	
	public void setVolume(int v) {
		this.volume=v;
		System.out.println(v);
	}
	
	
}
