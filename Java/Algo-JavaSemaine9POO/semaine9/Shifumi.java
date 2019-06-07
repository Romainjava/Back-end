package semaine9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shifumi {
	/**
	 * fonction qui me sert de flag pour vérifié la rentré ex:pierre dans le tableau et
	 * traité le cas dans mon main
	 * @param choix
	 * @return
	 */
	public static boolean verif(String choix) {
		String[] array = {"pierre", "feuille", "ciseau"};
		boolean flag = false;
		for(String regis : array)
		{
			if(regis.equals(choix))
			{
				flag=true;
			}
		}return flag;
	}

	/**
	 * Fonction qui genere un tableau aléatoire qui contient des réponses.
	 * @return
	 */
	public static ArrayList<String> tabAlea() {
		ArrayList<String> ordi = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int x = (int)(Math.random()*3+1);
			//System.out.println(x);
			if(x== 1) {
				ordi.add("feuille");
				//	System.out.println("L'ordi à choisi Feuille");
			}

			if(x==2) { 
				ordi.add("ciseau");
				//	System.out.println("L'ordi à choisi Ciseau");
			}
			if(x==3) {
				ordi.add("pierre");
				//	System.out.println("L'ordi à choisi Pierre");
			}
		}
		return ordi;
	}

	/**
	 * fonction qui me traite si on a gagner et retourne true dans ce cas la.
	 * @param jeu
	 * @param user
	 * @return
	 */
	public static boolean win(String jeu, String user) {
		boolean reponse = false;
		if(user.equals("pierre")&& jeu.equals("ciseau")) {
			reponse = true;
		}
		else if(user.equals("ciseau")&& jeu.equals("feuille")) {
			reponse = true;
		}
		else if(user.equals("feuille")&& jeu.equals("pierre")) {
			reponse = true;
		}
		return reponse;
	}

	/**
	 * fonction qui compare mes résultats.
	 * @param jeu // jeu
	 * @param user
	 */
	public static void comparaison(String jeu, String user ) {

		if(jeu.equals(user)) {
			resultat(1);
		}
		else if(!win(jeu, user)) {
			resultat(2);
		}
		else {
			resultat(3);
		}
	}

	/**
	 *fonction qui m'affiche le résultat
	 * @param comp
	 */
	public static void resultat(int comp) {
		String cas ="";

		switch(comp) {
		case 1:
			cas = "Egalité";
			break;
		case 2:
			cas = "Perdue";
			break;
		case 3:
			cas = "Gagner";
			break;
		default:
			cas= "Donnée incorrect recommencer";
			break;
		}
		System.out.println(cas);

	}
	/**
	 * ma fonction qui remplace mon main pour pouvoir l'utiliser en recursive et laisser
	 * l'utilisateur recommencer
	 */
	public static void partie() {
		Scanner sc = new Scanner(System.in);
		int essai = 3;
		ArrayList<String> ordi = tabAlea();
		/* je met en instruction ordi ma fonction tabAlea */
		Collections.reverse(ordi);
		//objet qui renverse mon Arraylist pour correspondre a essai 3

		while(essai!=0) {
			System.out.println("Veuillez saisir Feuille ou Pierre ou Ciseau");
			String utilisateur = sc.nextLine().toLowerCase();
			if(verif(utilisateur)){
				//les () de verif pointe  mon parametre "choix" dans la fonction verif et je la remplace par la fonction "utilisateur" en argument
				essai--;
				String jeu = ordi.get(essai); //ceci me permet d'utiliser l'index de mon ArrayList

				comparaison(jeu, utilisateur); //je place en argument mon var jeu qui correspond à l'ArrayList et l'entrée utilisateur
				System.out.println("L'ordi avait choisi " + ordi.get(essai));
				//ordi. "get" me permet de pointé un index et en parametre j'ai mis celui de essai
			}
			else {
				System.out.println("Vous avez saisi une mauvaise entrée");
			}


		}
		System.out.println("Vos 3 try sont fini, voulez vous recommencer: oui/non ?");
		String reponse = sc.nextLine().toLowerCase();
		if(reponse.equalsIgnoreCase("oui")) {
			partie(); //methode recursive qui rappel sa propre methode pour recommencer la partie
		}
		else {
			System.out.println("Euh non");
		}
		//	return (reponse =="oui"); fonction boolean qui me permet de faire pareil que la fonction récursive
		// Il m'aurait fallu changer la fonction en boolean pour return oui = true ou toutes autres reponse = false	
		sc.close();
	}

	public static void main(String[] args) {
		partie();

	}

}