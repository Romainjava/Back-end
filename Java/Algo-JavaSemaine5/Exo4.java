package semaine5;

import java.util.Scanner;

public class Exo4 {
	/*
	 * Exercice 4
	 * La suite de Fibonacci est définie par :
	 *f1 = 1,
	 * f2 = 1 et fn+2 = fn+1 + fn.
	 * Ecrire une fonction calculant le Nième élément de la suite.
	 * Exemple dexécution :
	 * Donnez la valeur de n :
	 * 5
	 * le 5ième élément de la suite est : 8
	 */

	public static int fibo(int i) {
		if( i == 1 || i == 0) { 
			return 1;
		}
		else {
		return fibo(i-1) + fibo(i-2);
		}
		/* ma methode récursive, j'ai trouver la formule sur le wiki de fibonacci
		 *  ça commence par 0 et 1 et le résultat est forcemment l'addition des
		 *  deux derniers entier donc pour f1 = 0 + 1 = 1
		 *  la ou c'est interressant c'est de mettre un sysout avant le 2eme return
		 *  et voir le nombre de calcul effectué par une methode récursive
		 */
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un entier stocké dans i");
		int i = sc.nextInt();
		System.out.println("le enieme mitsubishi est "+ i + " et sa suite est "+fibo(i));

		sc.close();
	}
}
