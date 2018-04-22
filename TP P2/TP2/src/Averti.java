import java.util.Observable;
import java.util.Observer;

public class Averti implements Observer{
	private int valeur;
	
	public Averti(){
		this.valeur=0;
	}
	public void update(Observable Av, Object arg) {
		// TODO Auto-generated method stub
		Avertisseur A= (Avertisseur) Av;
		setValeur(A.getValue());
	}
	public int getValeur() {
		try{
			return valeur;
		}catch(Exception e){
			System.out.println("Error caused whom is "+e.getMessage());
		}
		return 0;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	

}
