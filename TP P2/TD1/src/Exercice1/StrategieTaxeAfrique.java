package Exercice1;

public class StrategieTaxeAfrique extends StrategieTaxe{
	private StrategieTaxeUSA stUSA;
	double taxe(int m) {
		return stUSA.taxe(m)*0.8;
	}
}
