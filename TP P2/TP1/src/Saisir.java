import java.io.*;

public class Saisir {
    private static  BufferedReader entree=new BufferedReader (new InputStreamReader (System.in));
    static int entier()throws IOException {
	int sais_entier;
	System.out.println("Saisir un entier");
	String ligne;
	ligne = entree.readLine();
	sais_entier=Integer.parseInt(ligne);
	return sais_entier;
    }
    static double reeld()throws IOException{
	double sais_reeld;
	String ligne;
	System.out.println("Saisir un double");
	ligne = entree.readLine();
	sais_reeld = Double.parseDouble(ligne);	
	return sais_reeld;
    }
    static float reelf()throws IOException{
	float sais_reelf;
	String ligne;
	System.out.println("Saisissez un float");
	ligne = entree.readLine();
	sais_reelf = Float.parseFloat(ligne);
	return sais_reelf;
    }
    static String chaine()throws IOException{
	String sais_chaine;
	System.out.println("Saisissez une chaine");
	sais_chaine = entree.readLine();
	return sais_chaine;
    }
    static char car()throws IOException{
	char sais_car;
	String ligne;
	System.out.println("Saisissez un caractère");
	ligne = entree.readLine();
	sais_car=ligne.charAt(0);
	return sais_car;
    }
    public static void main (String[] args)throws IOException{
        
    }
}
