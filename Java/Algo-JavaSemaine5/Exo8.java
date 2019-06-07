package semaine5;

import java.util.Scanner;

public class Exo8 {
	/**
	 * Écrire un programme qui affiche un triangle isocèle formé d’étoiles. La hauteur du triangle
	 *(c’est-à-dire son nombre de lignes) sera fournie en donnée, comme dans l’exemple ci-
	 *dessous.
	 *On s’arrangera pour que la dernière ligne du triangle s’affiche sur le bord gauche de l’écran.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez un nombre entier");
		int user = sc.nextInt();


		for (int i = 0; i < user; i++) {
			for (int j = 0; j < user-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j <2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();

			//je vais essayer de le faire avec une matrice
			//mais de ce que je retiens c'est que le for for for ma rendu 0 1 1 
			//car les deux dernier for ne sont pas imbriqué ensemble
		}
	}
}
