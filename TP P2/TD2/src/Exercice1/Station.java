package Exercice1;

import java.util.Observable;
import java.util.Observer;

public class Station implements Observer {
	private String nom;
	private double somme;
	private double nbre;
	public Station(String n){
		// TODO Auto-generated constructor stub
		this.nom=n;
		this.somme=this.nbre=0.0;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Poste pp=(Poste) o;
		somme=somme+pp.getTemp();
		nbre++;
	}
	public double getMoyenne() {
		try {
			return this.somme/this.nbre;
		}catch(Exception e) {
			System.out.println("Erreur "+e.getMessage());
		}
		return 0.0;
	}

}
