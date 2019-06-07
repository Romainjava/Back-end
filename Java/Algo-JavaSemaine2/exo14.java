package semaine2;

import java.rmi.UnexpectedException;
import java.util.Scanner;

import jdk.internal.dynalink.ChainedCallSite;
class exo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		
		System.out.println("Saisir une chaine de cara" );
			str = sc.nextLine();
			
		String str2 = str.toUpperCase();
		
		System.out.println("Ceci devient en maj " + str2);
		
		String str3 = str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase();
		//* je transforme mon str2 dans une nvelle variable avec les modif suivante
		//* le 1er substring transforme ma 1er lettre et s'arrête apres le 1 en uppercase
		//* ma 2eme transforme je transforme substring(1) qui commence après la 1er lettre en lowercase
		//* substring(1) est l'index de début et de fin de la modification
		
		
		System.out.println(str3);
		
		
	}

}
