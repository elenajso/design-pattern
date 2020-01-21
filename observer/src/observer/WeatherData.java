package observer;

import java.util.ArrayList;
import java.util.Observer;

public class WeatherData implements Subject{

	private float temperature;
	private float humidity;
	private float pressure;
	
	private 	ArrayList<observer> observers;
	
	public WeatherData(){
		observers=new ArrayList<observer>();
	}

	public void measurementsChanged(){
	this.notifyobserver();
	}
	
 public void	setWeather(float temperature, float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		
		measurementsChanged();
	}
 
 public float getTemperature(){
	 return temperature;
 }
public float getHumidity() {
	return humidity;
}

public float getPressure() {
	return pressure;
}



	@Override
	public void registerObserver(observer o) {
		observers.add(o);
		
	}


	@Override
	public void removeObserver(observer o) {
		observers.remove(o);
		
	}


	@Override
	public void notifyobserver() {
		for(observer o:observers)
			o.update();
		
	}


	}

