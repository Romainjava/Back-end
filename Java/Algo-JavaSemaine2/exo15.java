package semaine2;

import java.util.Scanner;

class exo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int i = 6;
		
		
		System.out.println("rentrez un mot ");
			str = sc.nextLine();
		
			
		String str2 = str.substring(str.length() -3);  			//* je transforme mon str dans une nouvelle variable
		
																//* je parcours mon entrée avec .length et j'affiche les 3 derniers mots
		System.out.println("les 3 derniers lettres du mot sont : " + str2);
		
		if( i >= str.length()) {  
			System.out.println("erreur mot pas assez grand");  	//* ma condition si le mot n'est pas assez grand
		}
		else { 
			System.out.println("sans les 2er lettres et sans les 3 dernieres :" + str.substring(2, str.length() -3));
		//* départ substring à 2 de "illusion" "en mot" je parcours le reste avec le .length et je fais un -3
		}
		
		}
	}	


