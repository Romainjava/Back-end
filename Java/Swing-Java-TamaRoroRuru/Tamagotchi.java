package tamagotchi3;


import java.util.Scanner;

public class Tamagotchi {

	static Scanner scan = new Scanner(System.in);

	//Valeur comprise de -5 a 5//
	//Sauf l'age ( 0 à 15)//
	//Mort est (O ou 1)//
	private int faim;
	private int poid;
	private int propre;
	private int bonheur;
	private int muscle;
	private int fatigue;
	private String sex;
	private String nom = "Tama";
	private int age;
	private boolean vie = true;
	public String status;
	////END/////

	public String choix() {
		char user;
		boolean flag = true;
		String activity = error();
		String userEntry;

		while(flag == true) {
			flag = false;
			System.out.println("Quel activité voulez vous que "+ nom +" fasse \n Manger ? \n Dormir ? \n sport ? \n laver ? \n Jouer ?");
			userEntry = scan.nextLine().toLowerCase();
			if(userEntry.equals("")) {
				user = '?';
			}else {
				user = userEntry.charAt(0);
			}
			switch(user) {
			case 'm':
				activity = this.manger();
				break;
			case'd':
				activity =this.dormir();
				break;
			case 's': case 'a':
				activity = this.activiteSportive();
				break;
			case 'l':
				activity = this.douche();
				break;
			case 'j':
				activity = this.jeux();
				break;
			default: 
				activity = error();
				System.err.println("Erreur");
				flag = true;
				break;
			} 
		}
		return activity;
	}
	public String error() {
		String user;
		user = "error";
		return user;	
	}

	//ECLOSION//
	public String eclosion() {

		String user = "";		
		//nom = scan.nextLine();		
		setNom("Régis");
		user = "Votre tamagotchi sort de ça coquille !!!" + "il s'appelle " + getNom();
		setVie(true); //permet de relancer le jeu coté vue
		//Init du status a 0//
		//Tout les status vont de -5 a 5 sauf l'age//
		faim = 0; 
		poid = 0;
		propre = 0;
		bonheur = 0;
		muscle = 0;
		fatigue = 0;
		age = 0;

		return user;
	}
	//END//

	//CHOIX DU SEX//
	public void sex() {
		String choix;
		System.out.println("voulez vous choisir le sexe de votre tamagotchi ?");
		choix = scan.nextLine().toLowerCase();

		if (choix.equals("oui")) {

			System.out.println("Merci d'entrée votre choix (Male ou femelle ?");
			choix = scan.nextLine().toLowerCase();
			if(choix.equals("male")|| choix.equals("femelle"))

				setSex(choix);
			System.out.println("Votre tamagotchi est "+ getSex());
		}

		else  {
			System.out.println(choixAuto());
		}
	}
	public String choixAuto() {
		int random = (int)(Math.random()*2+1);
		String sex ="";
		switch(random) {
		case 1: setSex("male");
		break;
		case 2: setSex("femelle");
		break;

		}return sex;
	}
	//////END//////

	///LES ACTIVITE///
	public String manger() {
		status = "Votre tamagotchi se tape un bon burger ";
		faim ++ ;
		bonheur ++;
		propre --;
		poid ++;
		return status;
	}
	public String dormir() {

//		if(fatigue == -5) {
//			status = "Votre tamagotchi s'éffondre totalement de fatigue";
//		}else {
//			status = "Votre tamagotchi s'endort paisiblement !";
//		}
		status = "Votre tamagotchi dort à la pleine lune";
		bonheur ++;
		faim --;
		poid ++;
		propre ++;
		fatigue = 0;
		return status;
	}
	public String activiteSportive() {
		//status = "Votre tamagochi ce défonce a la salle :dab: :dab:";
		fatigue --;
		propre --;
		poid --;
		faim --;
		muscle++;
		return status;
	}
	public String douche() {
		status = "Votre tamagochi prend une bonne douche Oops il a fait tomber son savon !";
		propre ++;
		bonheur ++;
		fatigue --;
		return status;
	}
	public String jeux() {
		status = "Super votre tamagochi s'amuse comme un petit fou";
		bonheur ++;
		fatigue --;
		propre --;
		faim ++;
		return status;
	}
	//////END//////

	///LES STATUS///
	public String statusFaim() {
		String status = "";
		switch (faim) {
		case -5:
			status = nom + " est mort de Faim";
			setVie(false);
			break;
		case -4: 
			status =  " ATTENTION votre "+ nom +" meurt de faim";
			break;
		case 4:
			status =  " Attention votre "+ nom +" risque de vomir si vous le nourissez trop";
			break;
		case 5: 
			status = nom + " est mort dans son vomis !";
			setVie(false);
			break;
		default: 
			
			break;
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}
	public String statusPoid() {
		String status = "";
		switch (poid) {
		case -5:
			status = nom + " est mort";
			setVie(false);
			break;
		case -3: case -4:  
			status = nom + " est trop maigre et risque de mourir";
			break;

		case 4:
			status =  " Attention votre "+ nom +" risque de mourir d'obésité ";
			break;
		case 5: 
			status = nom + " Voila il est mort en roulant jusqu'à la mer et a coulé à cause de son poids";
			poid = 5;
			setVie(false);
			break;
		default:
			break;
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}	
	public String statusPropre() {
		String status = "";
		switch (propre) {
		case -5:
			status = nom + " est écrasé par un cochon dans une porcherie ";
			setVie(false);
			break;
		case -3: case -4: 
			status = nom + " à besoin de se laver vraiment ! POUAH ça pue";
			break;
		case 4:
			status = nom + " est propre";
			break;
		case 5: 
			status = nom + " Brille de propreté, on ne peut mieux ! ";
			propre = 5;
			break;
		default:
			break;
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}
	public String statusBonheur() {
		String status = "";
		switch (bonheur) {
		case -5:
			status = nom + " est mort de tristesse sous une musique de Nirvana";
			setVie(false);
			break;
		case -4: 
			status = nom + " commence à déprimer, il a acheté une boite de lexomil";
			break;
		case 4:
			status = nom + "  est heureux";
			break;
		case 5: case 6: case 7: 
			status = nom + " c'est suicidé car plus heureux ça l'énerve ";
			bonheur = 5;
			setVie(false);
			break;
		default: 
			break;
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}
	public String statusMuscle() {	
		String status = "";
		switch (muscle) {
		case -5:
			status = nom + " il est mort car trop faible physiquement pour se monde";
			setVie(false);
			break;
		case -3: case -4: 
			status = nom + " est faiblard ATTENTION besoin de muscle";
			break;
		case 4:
			status = " Attention "+ nom+" risque de ne plus passer les porte";
			break;
		case 5: 
			status = nom + " change de nom Scharwzeneger";
			setNom("Scharwzeneger");
			muscle = 5;
			break;
		default:
			break;
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}
	public String statusFatigue() {
		String status = "";
		switch (fatigue) {
		case -5:
			status = nom + " est mort de fatigue ";
			setVie(false);
			break;
		case -3: case -4: 
			status = nom + " meurt de fatigue il somnole";
			break;
		case 4:
			status = nom + " a bus trop de redbull";
			break;
		case 5: 
			status = nom + " Votre tamagocthi est mort d'une tension trop high";
			setVie(false);
			break;
		default:
			break; 
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}
	public String statusAge() {
		String status = "" + age;
		switch (age) {
		case 0:
			status = nom + " est tout juste sortie de l'oeuf il a " + age +"ans";
			break;
		case 1: case 2: case 3: case 4: 
			status = nom + " est un enfant il grandit vite il a " + age + " ans";
			break;
		case 5: case 6: case 7: 
			status = nom + " atteint l'adolescence (frapper avant d'entrée) il a " + age + " ans";
			break;
		case 8: case 9: case 10: case 11: case 12:
			status = nom + " est adulte !! il a " + age + " ans";
			break;
		case 13:  case 14:
			status = nom + " viellis a grand pas la mort le guette il a " + age + " ans";
			break;
		case 15: 
			status = " Votre tamagocthi est mort de viellesse rest in peace *tupac song*" + nom;
			vie = false;
			break;
		default:
			break;	
		}
		if(!status.equals("")) {
			status +="\n";
		}
		return status;
	}
	//////END//////

	public String checkStatus() {
		 status = statusFaim() + statusPoid()  + statusPropre()  + statusBonheur()  + statusMuscle()  + statusFatigue()  + statusAge();
		
		 return status;
//		statusFaim();
//		if(!statusFaim().equals("")) {
//			System.out.println(statusFaim());
//		}
//		statusPoid();
//		if(!statusPoid().equals("")) {
//			System.out.println(statusPoid());
//		}
//		statusBonheur();
//		if(!statusBonheur().equals("")) {
//			System.out.println(statusBonheur());
//		}
//		statusPropre();
//		if(!statusPropre().equals("")) {
//			System.out.println(statusPropre());
//		}
//		statusMuscle();
//		if(!statusMuscle().equals("")) {
//			System.out.println(statusMuscle());
//		}
//		statusFatigue();
//		if(!statusFatigue().equals("")) {
//			System.out.println(statusFatigue());
//		}
//		statusAge();
//		if(!statusAge().equals("")) {
//			System.out.println(statusAge());
//		}
		
	}

	//Testing things//
	@Override
	public String toString() {
		return "Tamagotchi [faim=" + faim + ", poid=" + poid + ", propre=" + propre + ", bonheur=" + bonheur
				+ ", muscle=" + muscle + ", fatigue=" + fatigue + "]";
	}
	///END///

	/////GET & SET//////

	public int getFaim() {
		return faim;
	}
	public void setFaim(int faim) {
		this.faim = faim;
	}
	public int getPoid() {
		return poid;
	}
	public void setPoid(int poid) {
		this.poid = poid;
	}
	public int getPropre() {
		return propre;
	}
	public void setPropre(int propre) {
		this.propre = propre;
	}
	public int getBonheur() {
		return bonheur;
	}
	public void setBonheur(int bonheur) {
		this.bonheur = bonheur;
	}
	public int getMuscle() {
		return muscle;
	}
	public void setMuscle(int muscle) {
		this.muscle = muscle;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getFatigue() {
		return fatigue;
	}
	public void setFatigue(int fatigue) {
		this.fatigue = fatigue;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVie() {
		return vie;
	}
	public void setVie(boolean vie) {
		this.vie = vie;
	}

	//////END//////


}