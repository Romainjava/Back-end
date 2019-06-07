package javatest;

import java.util.Scanner;

class exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ent1,ent2 ; //* Je crée  mon entier 1 et 2
		Scanner sc = new Scanner(System.in); //* je crée mon entrée de texte et je l'ai associé à mon ent1
		ent1 = sc.nextInt();
		for (ent2 = 0; ent2 <=10; ent2++) //* crée la condition table entre 1 et 10 et creation de la boucle
		{
			System.out.println (ent1 + " x " + ent2 + " = " + (ent1*ent2));
			
		}

	}

}
