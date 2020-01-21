package observer;

public class WeatherStation {
public static void main(String[] args) {
	
	WeatherData weather=new WeatherData();
	observer hs=new humidScreen();
	observer wd =new WeatherDisplay(weather);
	
	weather.setWeather(50.0f, 80.0f, 1000.0f);
	//weather.removeObserver(hs);
	weather.setWeather(40, 70, 800);
	
	weather.setWeather(30, 50, 800);
}
}
