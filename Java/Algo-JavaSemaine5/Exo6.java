package semaine5;

import java.util.Scanner;

public class Exo6 {
	/*Exercice 6
	 * Question 1 :
Écrire un programme JAVA calculant la somme des n premiers termes de la "série
harmonique", cest-à-dire la somme :
1 + 1/2 + 1/3 + 1/4 + ..... + 1/n
La valeur de n sera lue en donnée.
Exemple dexécution :
Donnez un entier :
2
La somme est : 1.5
Question 2 :
Améliorer le programme précédant afin de lire l'entier n, lors de l'exécution du programme.
Exemple dexécution :
C:\>java Serie 2
La somme est : 1.5
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		float j = 0;
		System.out.println("veuillez rentrer un entier");
		int x = sc.nextInt();
		//int x = Integer.parseInt(args[4]);

		/*je dis que tant que i est inférieur au chiffre utilisateur il me stock la division commençant à 1/1 dans j
		 * puis 2/1 qui s'additione à j donc 1 (ancienne division) */
		while(i<=x) {
			j += (float) 1/i;
			i++;
		}

		System.out.println("la somme est "+j);



		sc.close();	
	}

}

