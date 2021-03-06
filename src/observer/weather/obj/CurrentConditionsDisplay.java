package observer.weather.obj;

import observer.weather.interf.DisplayElement;
import observer.weather.interf.Observer;
import observer.weather.interf.Subject;

/**
 * 观察者：当前环境
 *
 * Blog : http://blog.csdn.net/lemon_tree12138
 * GitHub : https://github.com/William-Hai
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature; // 温度
	private float humidity; // 湿度
	@SuppressWarnings("unused")
    private Subject weatherData = null;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
