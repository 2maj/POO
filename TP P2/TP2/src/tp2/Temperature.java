package tp2;

import java.util.Observable;

public class Temperature extends Observable {
	private float temp;
	public Temperature(float t) {
		this.temp=t;
	}
	public void addtemperature(float t) {
		this.temp=t;
		this.setChanged();
		this.notifyAll();
	}
	public float getTemperature() {
		return this.temp;
	}
}
