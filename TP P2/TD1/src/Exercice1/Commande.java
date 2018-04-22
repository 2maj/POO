package Exercice1;

public abstract class Commande {
	private Client cli;
	private int montantHT;
	private StrategieTaxe calculTaxe;
	public Commande(Client cli, int m, StrategieTaxe st) {
		cli=cli;
		montantHT=m;
		calculTaxe=st;
	}
	double taxe(){
		return calculTaxe.taxe(montantHT);
	}
}
