package Exercice2;

import java.util.Observable;

public class Verificateur extends Personne {

	public Verificateur(int seuil) {
		super("Vérificateur", seuil);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.getNom()+" plus possible d'acheter car article cher";
	}

	@Override
	public void update(Observable o, Object arg) {
		Article art= (Article) o;
		if(art.getPrix() <= this.getSeuil()) {
			System.out.println(this+" "+art.getPrix());
		}
	}

}
