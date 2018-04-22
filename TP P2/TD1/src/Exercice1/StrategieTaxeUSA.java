package Exercice1;

public class StrategieTaxeUSA extends StrategieTaxe {

	@Override
	double taxe(int m) {
		return 10*(0.08*m);
	}

}
