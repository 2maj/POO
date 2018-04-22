import java.util.Observable;

public class Avertisseur extends Observable{
	private int value;
	public Avertisseur(){
		this.value=0;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		//Modifier la valeur et Notifier l'averti
		this.value = value;
		this.setChanged();
		//NotifyAll fonctionne pas
		this.notifyObservers(value);
	}
	
}