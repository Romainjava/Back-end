package exo12;

import java.util.Scanner;

class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tab1[] = new int [5]; //* initialise mon tab max = 5
		for ( int x = 0; x < tab1.length; x++) //* initialise une variable jusqu'a qu'elle remplisse le tab
		 {
		 tab1[x] = (int)(Math.random() *10+1); //* je la remplie de nombre alea
		 	
		 System.out.println(tab1[x]);
		 }
		 
		 for(int i = 0; i<tab1.length; i++) 
		 {
		 	 
		 if (tab1[i] == 4) 
		 	{
		 
			 System.out.println("Le chiffre 4 est en position " + (i+1));
		 	}
		 }
	}
}
