package Exercice1;

public class CommandeAfrique extends Commande {

	public CommandeAfrique(Client cli, int m) {
		super(cli, m, new StrategieTaxeAfrique());
	}

}
