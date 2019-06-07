package semaine5;

import java.util.Scanner;

public class Exo5 {
	/*
	 * Exercice 5
  Écrire un programme permettant de remplir un tableau de 5 éléments, ensuite calcule et
  affiche la somme des éléments de ce tableau.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tab[] = new int[5];
		int calcul=0;
		System.out.println("veuillez rentrer 5 elements dans le tableau");
		

		for(int i=0; i<tab.length; i++) {
			tab[i] = sc.nextInt();
			/* ma boucle qui me stock l'entrée utilisateur dans les index du tableau */
		}

		for (int i = 0; i < tab.length; i++) {
			calcul += tab[i];
			/*calcul opérateur qui stock dans la variable de gauche */
		}

		System.out.println("voici la somme des calculs "+ calcul);

		sc.close();
	}
}
