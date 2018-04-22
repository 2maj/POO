package Exercice2;

import java.util.Observable;

public class Article extends Observable {
	private String nomArt;
	private int prix;
	public Article(String nomArt, int prix) {
		super();
		this.nomArt = nomArt;
		this.prix = prix;
	}
	public int getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	public void evement(int p) {
		prix=p;
		this.setChanged();
		this.notifyAll();
	}
	public void plusCher() {
		this.prix +=1;
		System.out.println("Price Up");
	}
	public void moinsCher() {
		this.prix -=1;
		System.out.println("Price Down");
	}
}
