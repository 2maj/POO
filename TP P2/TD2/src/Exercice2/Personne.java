package Exercice2;

import java.util.Observable;
import java.util.Observer;

abstract class Personne implements Observer {
	private String nom;
	private int seuil;
	public Personne(String nom, int seuil) {
		super();
		this.nom = nom;
		this.seuil = seuil;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSeuil() {
		return seuil;
	}
	public void setSeuil(int seuil) {
		this.seuil = seuil;
	}
	public abstract String toString();
	@Override
	public abstract void update(Observable o, Object arg); //Question 3
	/*
	public void update(Observable o, Object arg) { //Question 2
		Article art= (Article) o;
		if(art.getPrix() <= seuil) {
			System.out.println(this);
		}else {
			System.out.println("Article cher !");
		}
		
	}
	*/

}
