package lg.devices;

public class Amp {

		String description;
		int volume;
		
		public Amp() {
		volume =3;
		description = "����";
		}
		
		public void on() {
			System.out.println("������ �������ϴ�");
			
		}
		
		public void off() {
			System.out.println("������ �������ϴ�");
		}
		
		public void setVolume(int v) {
			volume = v;
			
		}
		
}
