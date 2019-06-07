package semaine2;

import java.util.Scanner;


class exo13 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str; 								/* string variable pour entrée utilisateur n'1 */
		String cara; 								/* variable pour entrée n2 */
		
		System.out.println("Rentrez chaine de caractère =");
			str = sc.nextLine(); 					/* je stock */
			
		
			
		System.out.println("Saisie une Lettre = ");
			cara = sc.nextLine(); 					/* je stock */
		 
		
		char cara2 = cara.charAt(0);			 	/* conversion en char */ 
		int cpt = 0;								/* je déclare un int pour compté le nombre de lettres */
				
			for(int i = 0; i <str.length(); i++) 	/* boucle qui va stocké toutes les lettres grâce au .length */
					
			if(cara2 == str.charAt(i)){	 			/* ma condition qui retient le caractére utilisateur et qui le compare avec sa 1er entrée et le stock*/			
													/* je transforme mes entiers du i en char grâce à CharAt(i) le "i" dedans est la 1er entrée utilisateur stocké en chiffres. */
				cpt++; 								/* je compte le nombre carac */ 
				System.out.println("Il y a " + cpt  + " De " + cara2);
				}
			 
			 }

}