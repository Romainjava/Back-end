package exo2;

import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjetTableau tableau = new ObjetTableau(0);
	//	ObjetTableau obj1 = new ObjetTableau(6);
		
		System.out.println("nombre de case que vous voulez crée");

		tableau.add(sc.nextInt());
		tableau.affichage();	

		System.out.println("voici le nombre d'objet crée "+ObjetTableau.getCount()); 
		//methode pour afficher le nombre d'objet(ObjetTableau) crée via le constructeur et getter


		//		Instruction									Méthode classe ou instance ?			Affichage:
		//ObjetTableau.nombreObjets();						classe									affiche le nombre d'objet crée
		//ObjetTableau obj1 = new ObjetTableau(6);			classe									crée un objet nommé obj1 avec en argument 6
		//obj1.affiche();									instance								affiche le contenu de obj1
		//ObjetTableau.nombreObjets();						classe									affiche le nombre d'objet crée
		//ObjetTableau obj2= new ObjetTableau(3);			classe									crée un autre objet nommé obj2 avec en argument 3
		//obj2.affiche();									instance								affiche le contenu obj2
		//ObjetTableau.nombreObjets();						classe									affiche le nombre d'objet crée
		//

		//affiche le max
		System.out.println("voici le max " +tableau.maximum());
		
		//affiche le min
		System.out.println("voici le min "+tableau.minimum());
		
		//somme total
		System.out.println("voici la somme de total "+ tableau.somme());
		
		//egalité argument 3
		System.out.println("voici le nombre d'element égaux à mon argument 3: " + tableau.egal(3));
		
		//somme compris entre p et q
		System.out.println("Voici le nombre compté entre p et q: " + tableau.compris(1, 3));
		
		//1er element du tableau(ici l'argument est egal à l'index O du tab)
		System.out.println("Voici le premier element du tableau: " + tableau.premier(7));
		
		//dernier element du tableau(ici l'argument est egal a la longueur du tableau -1)
		System.out.println("Voici le dernier element du tableau: "+ tableau.dernier(5));
		
		//methode d'instance pour inverser mon tableau.
		tableau.inverse();
		
		//objet qui permet de renverser un tableau aussi comme on avait utiliser pour le shifumi
	//	Collections.reverse(tableau);
		
		
		sc.close();
	}

}
