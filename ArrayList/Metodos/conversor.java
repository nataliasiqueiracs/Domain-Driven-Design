package Aula9_metodos;

//converter min pra segundo
//converter hora para segundo
//converter metros para km
//converter celsius para Fahrenheit

public class conversor {

	public double celsiusFahrenheit(double tempCelsius) {
		return ((tempCelsius *9) / 5) + 32;
	}
	
	public double fahrenheitCelsius(double tempFahren) {
		return ((tempFahren - 32) * 5) / 9;
	}
	
	
}
