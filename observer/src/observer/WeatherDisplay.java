package observer;

public class WeatherDisplay implements observer{

	private float temperature;
	private float humidity;
	private float pressre;
	
	private WeatherData subject;
	
	public WeatherDisplay(WeatherData weather){
		weather.registerObserver(this);
		this.subject=weather;
		
	}
	public void display(){
		System.out.println("날씨 - 기온"+temperature+"습도"+humidity+"기압"+pressre);
	}

	@Override
	public void update() {
		this.temperature=subject.getTemperature();
		this.humidity=subject.getHumidity();
		this.pressre=subject.getPressure();
		
		display();
	}
	@Override
	public void setSubject(Subject subject) {
		
	}

}
