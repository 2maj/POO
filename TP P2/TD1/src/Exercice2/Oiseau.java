package Exercice2;

public abstract class Oiseau {
	private String categorie;
	private StrategieVol stv;
	public Oiseau(String c, StrategieVol st) {
		this.categorie=c;
		this.stv=st;
	}
	abstract void vieillir(int nbJour);
	abstract boolean isAdult();
	@Override
	public String toString() {
		return "Oiseau [categorie=" + categorie + ", stv=" + stv.distance() + "]";
	}
}
