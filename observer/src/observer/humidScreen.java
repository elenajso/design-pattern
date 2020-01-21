package observer;

public class humidScreen implements observer{
	private float humidity;
	private WeatherData subject;
	
	public void display(){
		System.out.println("½Àµµ´Â"+humidity);
	}
	@Override
	public void update() {
		this.humidity=subject.getHumidity();
		display();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSubject(Subject subject) {
		this.subject=(WeatherData)subject;
		
	}
	
	

}
