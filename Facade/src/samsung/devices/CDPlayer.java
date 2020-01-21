package samsung.devices;

public class CDPlayer {

	private int volume;
	
	public void play() {
		System.out.println("CD플레이어 플레이 시작");
	}
	
	public void stop() {
		System.out.println("CD 플레이어 정지");
	}
	
	public void setVolume(int v) {
		this.volume=v;
	}
}
