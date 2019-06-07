package semaine5;

import java.util.Arrays;

public class Exobonus {


	public static int affichage(int tab[] ) {
		int max = 0;
		/* je déclare ma variable max ici pour n'avoir qu'un seul arguments dans ma fonction */

		for (int i = 0; i < tab.length; i++) {
			if(tab[i] > max) {
				max = tab[i];
				/* je compare et ré-attribut une valeur dans max tant que celle ci 
				 * est inférieur à tab[i] 
				 */
			}
		}

		return max;
		/* je retourne la valeur de ma variable max DANS affichage */
	}




	public static void main(String[] args) {
		int tab[] = new int[10];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = (int)(Math.random()*100);
		}


		System.out.println(Arrays.toString(tab) +"\n son max est " + affichage(tab) );
		/* le fait d'avoir déclaré mon max dans la fonction me permet de retourné qu'un seul arguments car la valeur
		 * de ma variable est renvoyé à "affichage"
		 */

	}
}