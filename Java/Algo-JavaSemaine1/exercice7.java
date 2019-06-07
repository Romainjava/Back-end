package javatest;

import java.util.Scanner;

public class exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); //*appel type de variable

        System.out.println("Quel multiple voulez-vous ? (X)"); //*systeme qui pose la question
        int X = sc.nextInt(); //* entrée utilisateur

        System.out.println("Combien voulez-vous de multiple ? (N)");
        int N = sc.nextInt();


        for (int i=1; i<=N;i++) //* création du multiple de la boucle
        {
            System.out.println(i*X); //*calcule afficher

        }
        
	
	}
	    }
	


