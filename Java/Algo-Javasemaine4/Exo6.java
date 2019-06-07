package semaine4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		LocalTime oldtime = LocalTime.now(); 
		/*j'importe mon objet temps
		 que je stock dans une variable qui me servira de pts de départ donc "l'ancien temps" */

		LocalTime newTime; /* new temps sans valeur qui sera le point de fin et comparé à oldtime */
		Scanner sc = new Scanner(System.in);
		int ordi = (int)(Math.random()*1000+1); /* genere nombre alea stock dans "ordi" entre 0 et 1000 */
		System.out.println(ordi);               /* je m'affiche l'entrée aleatoire pour m'aider */
		boolean boule = true;
		int essai  = 0; /* Mon compteur qui commence à 0 */

		while(boule) /* ma boucle principal qui tourne tant que c'est pas trouvé */
		{
			int user = sc.nextInt(); /* entrée utilisateur stock dans user */
			if(ordi<user) 
			{
				System.out.println("C'est -");
				essai++; /* j'incrémente mon compteur */
			}
			if(ordi>user)
			{
				System.out.println("C'est +");
				essai++;
			}
			if(ordi == user)
			{
				newTime = LocalTime.now();
				Duration temps = Duration.between(oldtime, newTime); 
				
				/* duration object qui permet de comparé (between)
				mes localtime je l'ai mise dans ma boolean car newtime n'étais pas défini */

				System.out.println("bravo le chiffre était " + ordi + " Le nombre d'essai est "
						+ essai + " et le temps passé est de " + temps.getSeconds()+" secondes");
				
				/* .getSeconds() me permet de récuperer mon temps en seconde */
				
				boule=false; 
				/* mon boolean de sortie */
			}

		}

	}

}
