package jeu;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Avatar player = null;
	static Avatar adversaire = null;


	/**
	 **********METHODE DE CHOIX AVATAR************* 
	 * @return un Avatar
	 */
	public static Avatar choix() {
		char user;
		String userEntry;
		Avatar avatar = null;

		System.out.println("Quel avatar vous souhaitez crée ? Guerrier/Mage/Rogue ?");
		userEntry = sc.nextLine().toLowerCase();

		if(userEntry.equals("")) {
			user = '?';
		}else {
			user = userEntry.charAt(0);
		}
		switch(user) {
		case 'g' :
			avatar = new Guerrier();
			break;
		case 'm' :
			avatar = new Mage();
			break;
		case 'r':
			avatar = new Rogue();
			break;
		}
		return avatar;
	}

	/**
	 *  **********METHODE DE CHOIX AVATAR ADVERSAIRE************* 
	 * @return
	 */
	public static Avatar choixAdversaire() {
		char user;
		String userEntry;
		Avatar avatar = null;

		System.out.println("Quel avatar vous souhaitez crée ? Guerrier/Mage/Rogue ?");
		userEntry = sc.nextLine().toLowerCase();

		if(userEntry.equals("")) {
			user = '?';
		}else {
			user = userEntry.charAt(0);
		}
		switch(user) {
		case 'g' :
			avatar = new Guerrier();
			break;
		case 'm' :
			avatar = new Mage();
			break;
		case 'r':
			avatar = new Rogue();
			break;
		}
		return avatar;
	}


	/**
	 * Methode pour check la mort
	 * @param player
	 * @param ennemy
	 * @return
	 */
	public static boolean death(Avatar player, Avatar ennemy) {
		boolean death = false;
		if(player.getVie() < 1 ) {
			System.out.println(player.getNom() + " est mort :( ");
			death = true;

		}
		else if(ennemy.getVie() < 1) {
					System.out.println(ennemy.getNom() + " votre ennemi est mort :) ");
				death = true;
				}
		else {
			death = false;
		}
		return death;
	}

	/**
	 * Methode pour le tour du joueur
	 * @param player
	 * @param adversaire
	 */
	public static void tourJoueur(Avatar player, Avatar adversaire) {
		boolean verif = true;
		System.out.println("C'est le tour de votre joueur, que faire, que faire... (Combattre//Potion)");

		while(verif) {
			String saisie = sc.nextLine().toLowerCase();
			switch(saisie) {
			case "potion" : 
				if(player.getPotion() > 0) {
					player.boireUnePotion();
					player.setPotion(-1);
					verif= false;
				}
				else {
					System.out.println("vous n'avez plus de potion, ATTAQUEZ OU MOURREZ");
					verif = true;
				}
				break;
			case "combattre" :
				player.attaquer(adversaire);
				verif = false;
				break;
			default: System.out.println("Je n'ai pas compris, Combattre ou Potion ?");
			}	
		}
	}

	/**
	 * Tour de l'adversaire, condition de vie low = potion sinon attaquer
	 * @param player
	 * @param adversaire
	 */
	public static void tourAdversaire(Avatar player, Avatar adversaire) {
		System.out.println("c'est à " + adversaire.getNom() +" de jouer !!");
		if(adversaire.getVie() < 150 && adversaire.getPotion() > 0) {
			adversaire.boireUnePotion();
			adversaire.setPotion(-1);
		}else {
			adversaire.attaquer(player);
		}

	}

	/**
	 * METHODE POUR L AFFRONTEMENT
	 * @param player
	 * @param ennemy
	 */
	public static void combat(Avatar player, Avatar ennemy) {	
		tourJoueur(player, ennemy);
		tourAdversaire(player, ennemy);

	}

	public static void main(String[] args) {
		player = choix();
		adversaire = choix();
		
		player.saluer(adversaire);
		adversaire.saluer(player);
		System.out.println(adversaire.getNom()+ " lui reste "+adversaire.getGold() + " de gold");

		while(death(player, adversaire) == false) {
			combat(player,adversaire);
			

		}
	}
}

