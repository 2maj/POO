
public abstract class Gere extends Etat {
	
	public Gere(Machine mac) {
		super(mac);
		// TODO Auto-generated constructor stub
	}

	@Override
	void machin() {
		// TODO Auto-generated method stub

	}

	@Override
	void truc() {
		// TODO Auto-generated method stub
		mac.setEtarCourant(mac.getBli());
	}

}
