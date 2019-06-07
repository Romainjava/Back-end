package jeu;

public class Guerrier extends Avatar {




	public Guerrier() {
		super.setNom("Laintime");
		super.setVie(500);
		super.setPower(60);
		super.setGold(30);
		super.setMagie(1);
		super.setPotion(2);
	}

	@Override
	public void saluer(Avatar ennemy) {
		System.out.println("Arg");
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
		System.out.println("BLADESTORM *tourne* *tourne* *tourne* (il sait faire que ça) ");
		ennemy.setVie(ennemy.getVie()-this.getPower());
		System.out.println(this.getNom() + " à retiré "+ this.getPower() + " a l'adversaire "+ ennemy.getNom() + "\n il lui reste "+ ennemy.getVie() + " de pts de vie");

	}



}
