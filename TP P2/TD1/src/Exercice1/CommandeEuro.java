package Exercice1;

public class CommandeEuro extends Commande {

	public CommandeEuro(Client cli, int m) {
		super(cli, m, new StrategieTaxeEuro());
		// TODO Auto-generated constructor stub
	}

}
