package exoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static Livre ajout() {
		Scanner sc = new Scanner(System.in);
		System.out.println("donnez le titre du livre "+ Livre.getCount()); //compteur en static 
		String  titre = sc.nextLine();
		System.out.println("donnez l'auteur du livre "+ Livre.getCount());
		String  auteur = sc.nextLine();
		System.out.println("donnez le prix du livre "+ Livre.getCount());
		int prix = sc.nextInt();
		sc.nextLine();
		Livre livre= new Livre(titre, auteur, prix);
		
		return livre;
	}
	
	public static void main(String[] args) {
		String reponse="";
		ArrayList<Livre> l1 = new ArrayList<Livre>();
		Scanner sc = new Scanner(System.in);
		
//		Livre livre1 = ajout();
//		System.out.println(livre1);
//
//		Livre livre2 = ajout();
//		System.out.println(livre2);
//
//		Livre livre3 = ajout();
//		System.out.println(livre3);

		
		
		//exo pouss� plus loin
		
		System.out.println("oui ou non");
		reponse = sc.nextLine();
		while(reponse.equals("oui")) {
			Livre livre = ajout();
			l1.add(livre);
			
			System.out.println("oui ? = on continu && non = on stop");
			reponse = sc.nextLine();
			
		} 
			
				System.out.println(l1); 
				

	}

}
