package semaine4;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tab[] = new String[10];
		String email1 = "@orange.fr";
		String email2 = "@hotmail.com";
		String email3 = "@msn.fr";
		String fai = "";
		int compt1=0, compt2=0, compt3 = 0;
		/* mon for qui parcours le tableau avec ma variable i */
		/* ma variable rand qui stock les conditions */
		for(int i=0; i<3; i++) 
		{
			int rand = (int)(Math.random() *3+1);

			if (rand == 1)
			{
				tab[i] = "jean-michel" + email1;
			}	
			else if (rand == 2) 
			{
				tab[i] = "jmdoudoux" + email2;
			}	
			else /*jamais de condition dans un else, elle même est une condition */
			{
				tab[i] = "richardoudoux" + email3;
			}
		}

		for(int x=0; x<3; x++) /* J'utilise x comme index et ensuite je lui applique .indexOf
			 						pour récup la position de @*/
		{
			String e = tab[x]; /* dans mon tableau j'indique que la case en position x 
								  est stocké dans un string
			 */

			int stock = tab[x].indexOf('@');    /* de commencer par rapport à la position de @ */
			for(int j=stock; j<e.length(); j++) /* j'utilise la position de @ comme initialisation de 
												ma boucle  et je commence dessus */
			{
				//System.out.println(e.charAt(j)); */
				//	fai = fai+e.charAt(j); 			/* j'ajoute le char position j à mon string*/
				/*					et à chaque boucle.. */
				fai += e.charAt(j); /* même méthode mais en plus utilisé dans le langage java et javascript */
				if(fai.equals(email1))
				{
					compt1++;
					fai = "";		// je renitilise fai quand je rentre dans la condition
				}
				if(fai.equals(email2)) 
				{
					compt2++;
					fai = "";
				}
				if(fai.equals(email3)) 
				{
					compt3++;
					fai = "";
				}
			}

		}		//ctrl a ctrl i = indentation muy bien ?! si si senior!
		System.out.println("Il y a "+ compt1 +" de "+ email1+ " Il y a " + compt2 +" de "+ email2+ " Il y a  " +compt3 + " de "+ email3 );

	}		
}