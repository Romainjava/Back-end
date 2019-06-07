package semaine5;

import java.util.Scanner;

public class Exo2 {
	/*
	 * Écrire un programme qui lit un entier au clavier et qui laffiche verticalement comme dans cet exemple :
Exemple dexécution :
Donnez un nombre entier : 785412
7
8
5
4
1
2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("rentrez une chaine de nombres entiers");
		int entier = sc.nextInt();

		//String entier2 = entier + ""; 
		/*astuce trouvé sur internet mais je voulais une methode donc j'suis partie sur autre chose */

		String entier2 = String.valueOf(entier); 
		/* je convertie mon int en string pour pouvoir le parcourir avec un .length() */
		for(int i=0; i<entier2.length(); i++)
		{
			System.out.println(entier2.charAt(i)); 
			/* je convertie mon entier string en charAt qui me permet de compter mes entiers 
			 et de parcourir mon index avec ma boucle i */
		}

		sc.close();
	} 

}



