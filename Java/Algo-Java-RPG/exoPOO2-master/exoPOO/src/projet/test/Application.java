package projet.test;

import java.util.ArrayList;
import java.util.Scanner;
import projet.classes.Employe;
import projet.classes.Etudiant;
import projet.classes.Professeur;

public class Application {
	static Scanner sc = new Scanner(System.in);
	
	
	/*
	 * methode qui return objet etudiant
	 */
	public static Etudiant etudiant() {
		System.out.println("Veuillez entrez le nom étudiant");
		String nom = sc.nextLine();
		System.out.println("veuillez entrez son prénom étudiant");
		String prenom = sc.nextLine();
		System.out.println("veuillez entre le cne de l'étudiant");
		String cne = sc.nextLine();
		
		Etudiant etudiant = new Etudiant(nom, prenom, cne);
			
		return etudiant;
	}
	
	/*
	 * methode qui return objet employe
	 */
	public static Employe employe() {
		System.out.println("Veuillez entrez le nom de l'employé");
		String nom = sc.nextLine();
		System.out.println("veuillez entrez son prénom de l'employé");
		String prenom = sc.nextLine();
		System.out.println("veuillez entrez son salaire de l'employé");
		double salaire = sc.nextInt();
		sc.nextLine();
		
		Employe employe = new Employe(nom, prenom, salaire);

		return employe;
	}
	
	/*
	 * methode qui return objet professeur
	 */
	public static Professeur professeur() {
		
		
		System.out.println("Veuillez entrez le nom el professor");
		String nom = sc.nextLine();
		System.out.println("veuillez entrez son prénom el professor");
		String prenom = sc.nextLine();
		System.out.println("veuillez entrez son salaire el professor");
		double salaire = sc.nextInt();
		sc.nextLine();
		System.out.println("Veuillez entrer sa spécialité el professor");
		String specialite = sc.nextLine();
	
		Professeur professeur = new Professeur(nom, prenom, salaire, specialite);
		
		return professeur;
	}

	public static void main(String[] args) {
		ArrayList<Object> liste = new ArrayList<Object>();
		
		/************************************************************/
		/******************** CREATION DEUX ETUDIANTS   ********************/
		/************************************************************/
		for (int i = 0; i < 2; i++) {
			Etudiant etudiant = etudiant();
			liste.add(etudiant);
		}
		System.out.println(liste);

		
		/************************************************************/
		/******************** CREATION DEUX EMPLOYES   ********************/
		/************************************************************/
		for (int i = 0; i < 2; i++) {
			Employe employe = employe();
			liste.add(employe);
		}
		System.out.println(liste);

		/************************************************************/
		/******************** CREATION DE DEUX PROFESSEURS   ********************/
		/************************************************************/
		for (int i = 0; i < 2; i++) {
			Professeur professeur = professeur();
			liste.add(professeur);
		}
		System.out.println(liste);
	}
}
