package semaine4;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Exo5 {

	public static void main(String[] args) {
		int tab[] = new int[3];
		int essai = 0;
		boolean boule = true;

		while(boule) 
/* ma boucle continu tant qu'elle ne rentre pas dans la condition, si elle rentre dans la cond la boolean 
			 devient false et on sort de la boucle */
		 											
		{
			for(int i=0; i<tab.length; i++)
			{
				tab[i] = (int)(Math.random() *1000+1);
			}
			if((tab[0]%2)==0 && (tab[1]%2)==0&&(tab[2]%2)==0)
				
/* % = modulo est le reste d'une division %2 = est forcemment = à 0 si pair et 1 si impair 
17divisé par 2 reste 1 */
				
			{													
				boule = false;
			}
			else
			{
				essai++;
			}
		}
		System.out.println("le nombre d'essai est de "+ essai + " voici votre tableau "+ Arrays.toString(tab));
	}
}		/* Array semble être une methode d'affichage de tableau qu'on doit importer */
