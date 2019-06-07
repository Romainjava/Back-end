package exo1;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass{
	
	static Scanner sc = new Scanner(System.in);
	
	public  static Voiture saisieVoiture() {
		
		System.out.println("Indiquez la marque");
		String userEntry = sc.nextLine();

		Voiture maVoiture = new Voiture(userEntry);

		System.out.println("indiquez une couleur");
		userEntry = sc.nextLine();
		maVoiture.setCouleur(userEntry);


		System.out.println("Votre voiture à t'elle 5 portieres ?  (oui/non)");
		userEntry = sc.nextLine();
		if(userEntry.equals("oui")) {
			maVoiture.setPorte(5);
		}

		
		return maVoiture;
		
	}

	public static void affiche2(Voiture uneVoiture){
		System.out.println(uneVoiture.getCouleur() + " "+ uneVoiture.getMarque()+ " "+ uneVoiture.getPorte() );
	}

//	public static void essaiBatmobil() {
//		Voiture batmobil = new Voiture("Waynes");
//
//		batmobil.setCouleur("noire");
//	 //ctrl clic gauche pour acceder aux getter and setters */
//
//		//3 type pour afficher
//		batmobil.affiche();
//		affiche2(batmobil);
//		Voiture.affiche3(batmobil);
//	}


	public static void main(String[] args) {
		//essaiBatmobil();

		System.out.println("Combien de voiture voulez-vous ?");
		int usEnt = sc.nextInt();
		sc.nextLine();
		//Creation d'un tableau d'objet
		Voiture[] parking = new Voiture[usEnt];
		
		for (int i = 0; i < usEnt; i++) {
			parking[i] = saisieVoiture();
		}
		//System.out.println(Arrays.toString(parking));
		
		//for:each pour afficher un tableau d'objet
		for(Voiture voiture : parking) {
			voiture.affiche();
			
		}
		
		
	}

}
