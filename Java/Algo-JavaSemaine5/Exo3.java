package semaine5;

import java.util.Scanner;

public class Exo3 {
	/*
	 * Exercice 3
Écrire une fonction permettant de calculer le factoriel dun entier saisi au clavier.
Sachant que :
N ! = N * (N  1) !
1! = 0! = 1
Exemple dexécution :
Donnez la valeur de n :
5
Le factoriel de 5 est :120
	 */

	public static int facto(int i) {
		if(i == 0 || i == 1)
		{
			return 1;
		}
		else
		{
			return i*facto(i-1);
		}
		/* je me suis inspiré de cette video https://www.youtube.com/watch?v=dfLPh1oWJNg 
		 * chaque facto est réduit jusqu'à la condition du if et stock dans la nvelle 
		 * variable, une fois atteind 1 il fait alors le calcule jusqu'au facto rentré dans
		 * i. Ceci est la méthode de récursivité.*/
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez votre factoriel stocké dans i");

		int i = sc.nextInt();
		System.out.println("le facto de " +i+ " est "+ facto(i));

		sc.close();
	}
}
