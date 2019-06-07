package semaine5;

import java.util.Scanner;

public class Exo7 {
	/*
	 * Écrire un programme qui crée un tableau comportant les valeurs des carrés des n
premiers nombres impairs, la valeur de n étant lue au clavier et qui en affiche les valeurs
sous la forme suivante

Exemple d’exécution :
Combien de valeurs : 5
1 a pour carre 1
3 a pour carre 9
5 a pour carre 25
7 a pour carre 49
9 a pour carre 81
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez un chiffre");
		int n = sc.nextInt();
		int tab[] = new int[n];
		int impair= 1;


		// 2 variable int, une pour faire les nombres impair, l'autre pour le calcul

		for (int i = 0; i < n; i++) {
			tab[i]= impair*impair;
			System.out.println(impair+ " a pour carre " +tab[i]);
			impair += 2;
		}

		/* for (int i = 0; i < n; i++) {
			System.out.println("i=" + i + " " + (2*i+1));
			int c = (2*i+1);
			//astuce pour trouver les nombres impairs
			tab[i] = c*c;

			System.out.println(tab[i]); 

		} */
	}

}
