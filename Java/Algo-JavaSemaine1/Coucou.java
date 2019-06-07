package javatest;

import java.util.Scanner;


class Coucou {

public static void main(String[] arg){ //* code qui déclare le code principal
	
	Scanner sc = new Scanner(System.in); //*type de variable qui va lire
        System.out.println("Quel est ton nom"); //* la question
        String str = sc.nextLine(); //*  string = Type de la variable (insister le type) pour les lettres (pour écrire) l'utilisateur donne la réponse
        System.out.println("Coucou" + " " + str); //* Le systeme répond / "" peut avoir un espace pour en crée un la je ne l'ai pas fait pour me rappeler de mon erreur et j'ai crée une autre double cote ("")
}
}