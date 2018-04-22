package Exercice1;

public class CommandeUSA extends Commande {

	public CommandeUSA(Client cli, int m) {
		super(cli, m, new StrategieTaxeUSA());
		// TODO Auto-generated constructor stub
	}

}
