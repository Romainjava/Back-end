package semaine9;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Voiture voiture = new Voiture();
		
		String marque1;
		int porte1;
		String couleur1;
		
			System.out.println("Veuillez choisir la marque de votre voiture");
			marque1=sc.nextLine();
			voiture.setMarque(marque1);
			
			System.out.println("Veuillez dire quelle couleurs");
			couleur1=sc.nextLine();
			voiture.setCouleur(couleur1);
			
			System.out.println("Veuillez choisir le nombre de porte");
			porte1=sc.nextInt();
			voiture.setPorte(porte1);
			sc.nextLine();
			
			voiture.affichage();
			
		//j'utilise pas de variable pour stocké ici 
		Voiture voiture2 = new Voiture();
		System.out.println("Veuillez choisir la marque de votre voiture num 2");
		voiture2.setMarque(sc.nextLine());
		
		System.out.println("Veuillez dire quelle couleurs num 2");
		voiture2.setCouleur(sc.nextLine());
		
		System.out.println("Veuillez choisir le nombre de porte num 2");
		voiture2.setPorte(sc.nextInt());
		sc.nextLine();
		
		voiture2.affichage();
		
		//partie 5 de l'exo j'appel ma methode affichage pour stocké ce qu'il y a dedans dans ma string
		String parking = voiture.affichage() + voiture2.affichage();
		System.out.println(parking);
	}

}
