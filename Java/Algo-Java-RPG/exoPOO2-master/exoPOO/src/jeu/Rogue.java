package jeu;

public class Rogue extends Avatar {



	public Rogue() {
		super.setNom("IllusionIV");
		super.setVie(200);
		super.setPower(30);
		super.setGold(15);
		super.setMagie(1);	
		super.setPotion(2);
	}

	/************************************************************/
	/********************  METHODE DE LA CLASS MERE  ********************/
	/************************************************************/
	@Override
	public void saluer(Avatar ennemy) {
		System.out.println("Bonjour, que vous me semblez beau aujourd'hui");
		this.setGold(+5);
		ennemy.setGold(ennemy.getGold()-5);
		System.out.println("*****Hop aspiré les 5 golds******");

	}

	@Override
	public void boireUnePotion() {
		if(this.getPotion()>0) {
		System.out.println(this.getNom() + "bois une potion");
		this.setVie(+100);
		}else {
			System.out.println("plus de potion");
		}

	}

	@Override
	public void attaquer(Avatar ennemy) {
		System.out.println("Openning from the shadow, cheap shot into kidney, Mutilate Mutilate, ENVENOM");
		int i = (int)(Math.random()*10+1);
		if(i <= 2) {
			System.out.println("COUP CRITIQUE");
			ennemy.setVie(ennemy.getVie()-(this.getPower()*3));
			System.out.println(this.getNom() + " à retiré "+ (this.getPower()*5) + " a l'adversaire "+ ennemy.getNom() + "\n il lui reste "+ ennemy.getVie() + " de pts de vie");
		}else {
			ennemy.setVie(ennemy.getVie()-this.getPower());
			System.out.println(this.getNom() + " à retiré "+ this.getPower() + " a l'adversaire "+ ennemy.getNom() + "\n il lui reste "+ ennemy.getVie() + " de pts de vie");
		}
	}



}
