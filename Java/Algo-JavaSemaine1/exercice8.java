package javatest;

import java.util.Scanner;

class exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int tabAge[] = new int[20]; //* tableau avec nombre d'entrées max 20
		int n = 0; //variable qui va me permettre de calculer
		
			
		  for (int j = 0; j < tabAge.length; j++) // ma boucle qui va stocké et le .length qui va s'arrêter à la 20eme entrée
			{
			System.out.println("Veuillez entrez votre âge");
				 tabAge[j] = sc.nextInt(); // j'entre ma variable j qui me sert pour stocké dans le tableau
				
		
		  if (tabAge[j]<20) // j'indique la condition inférieur à 20 des entiers stocké avec j
		  		
		  {
			  n = n+1; // ma variable qui rajoute 1 à chaque fois que moins de 20 est choisi par l'utilisateur
		  }		
			}	
		  	System.out.println("Il y a "+ n +" qui ont moins de 20 ans"); // méssage qui indique mon nombre de personnes de -20ans 
		
		
		
		   
		
		

	}

}
