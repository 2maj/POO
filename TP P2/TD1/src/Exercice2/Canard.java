package Exercice2;

public class Canard extends Oiseau {

	public Canard(String c) {
		super(c, new VolMigrateur());
		// TODO Auto-generated constructor stub
	}

	@Override
	void vieillir(int nbJour) {
		System.out.println(nbJour+" Pour vieillir");
	}

	@Override
	boolean isAdult() {
		return false;
	}

}
