package lg.devices;

public class Amp {

		String description;
		int volume;
		
		public Amp() {
		volume =3;
		description = "¾ÚÇÁ";
		}
		
		public void on() {
			System.out.println("¾ÚÇÁ°¡ ÄÑÁ³½À´Ï´Ù");
			
		}
		
		public void off() {
			System.out.println("¾ÚÇÁ°¡ ²¨Á³½À´Ï´Ù");
		}
		
		public void setVolume(int v) {
			volume = v;
			
		}
		
}
