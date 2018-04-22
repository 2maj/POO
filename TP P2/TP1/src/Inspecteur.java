import java.io.IOException;

public class Inspecteur extends Personne {
	private static Inspecteur p=null;
	private Inspecteur(String nom){
		super(nom);
	}
	static Inspecteur donneeIns() throws IOException{
		if(p==null){
			p= new Inspecteur(Saisir.chaine());
		}
		return p;
	}
}
