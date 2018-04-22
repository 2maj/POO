package Exercice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poste Brest = new Poste("Brest");
		Poste Paris = new Poste("Paris");
		Station Europe = new Station("Europe");
		Station France = new Station("France");
		Brest.addObserver(Europe);
		Brest.addObserver(France);
		Paris.addObserver(France);
		Brest.addTemp(18.0);
		Paris.addTemp(24.0);
		System.out.println("From Europe Station "+Europe.getMoyenne());
		System.out.println("From French Station "+France.getMoyenne());
		
	}

}
