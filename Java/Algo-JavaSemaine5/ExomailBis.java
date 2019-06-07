package semaine5;

public class ExomailBis {

	public static String affichage(String fournisseur, int compteur) {
/**methode qui affiche avec le s ou sans le s si c'est pas au pluriel
 * @fournisseur
 * @compteur
 *@author simoccjavmonp12
 */
		String s = " il y a " + compteur + " adresse";

		if (compteur > 1 ) {
			s += "s " + fournisseur;

		}

		else {
			s += " " + fournisseur;
		}

		return s;
	}

	public static void main(String[] args) {

		//declaration d'un tableau de 10 String
		String[] email = new String[ 10 ];	 
		//initialization des compteurs 	
		int comptGmail=0, comptOutlook=0, comptFree=0, comptOrange=0 , comptSfr=0,  comptHotmail=0;
		// Tableau rempli 

		email [ 0 ] =  "dede.gui@gmail.fr" ;
		email [ 1 ] =  "jiji@gmail.fr" ;
		email [ 2 ] =  "guigui.dodo@outlook.fr" ;
		email [ 3 ] =  "popy@outlook.fr" ;
		email [ 4 ] =  "mike@gmail.fr" ;
		email [ 5 ] =  "hall@gmail.fr" ;
		email [ 6 ] =  "yoyo@free.fr" ;
		email [ 7 ] =  "fifa@orange.fr" ;
		email [ 8 ] =  "bigi@sfr.fr" ;
		email [ 9 ] =  "pac@hotmail.com" ;

		for (int i = 0; i < email.length; i++) {

			int debutIndex = email[i].indexOf("@");
			int finIndex = email[i].lastIndexOf(".");
			String fournisseur = email[i].substring(debutIndex, finIndex);

			//System.out.println(fournisseur);

			switch (fournisseur ) {

			case "@gmail" :
				comptGmail++;
				break;
			case "@outlook" : 
				comptOutlook++;
				break;
			case "@free" : 
				comptFree++;
				break;
			case "@orange" : 
				comptOrange++;
				break;
			case "@sfr" : 
				comptSfr++;
				break;
			case "@hotmail" : 
				comptHotmail++;
				break;
			}
		}

		/*		System.out.println(" il y a " + comptGmail + " adresses gmail ");
			System.out.println(" il y a " + comptOutlook + " adresses outlook ");
			System.out.println(" il y a " + comptFree + " adresses free ");
			System.out.println(" il y a " + comptOrange + " adresses orange ");
			System.out.println(" il y a " + comptSfr + " adresses sfr ");
			System.out.println(" il y a " + comptHotmail + " adresse hotmail ");

		 */
		System.out.println(affichage("Gmail", comptGmail ));

		System.out.println(affichage("Sfr", comptSfr ));
		
	}	
}


