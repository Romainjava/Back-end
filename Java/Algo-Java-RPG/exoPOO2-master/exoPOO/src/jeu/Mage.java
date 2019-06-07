package jeu;

public class Mage extends Avatar {





	public Mage() {

		super.setNom("Sia");
		super.setVie(300);
		super.setPower(15);
		super.setGold(30);
		super.setMagie(30);
		super.setPotion(2);

	}


	public void saluer(Avatar ennemy) {
		System.out.println("Hello, sir");

	}


	public void boireUnePotion() {
		if(this.getPotion()>0) {
			System.out.println(this.getNom() + "bois une potion");
			this.setVie(+100);
		}else {
			System.out.println("plus de potion");
		}
	}


	public void attaquer(Avatar ennemy) {
		System.out.println("Cours et cast des FireBlasts en même temps");

		if(this.getVie() < 100 && this.getMagie() >= 10) {
			System.out.println(this.getNom() + " arrête de cast des fireblast, il root avec une nova et cast une EXPLOSION PYROTECHNIQUE");
			ennemy.setVie(ennemy.getVie()-(this.getPower()*10));
			System.out.println(this.getNom() + " à retiré "+ (this.getPower()*10) + " a l'adversaire "+ ennemy.getNom() + "\n il lui reste "+ ennemy.getVie() + " de pts de vie");
			this.setMagie(getMagie()-10);
			System.out.println(this.getNom()+ " lui reste "+ this.getMagie() + " de mana");
		}else {
			ennemy.setVie(ennemy.getVie()-this.getPower());
			System.out.println(this.getNom() + " à retiré "+ this.getPower() + " a l'adversaire "+ ennemy.getNom() + "\n il lui reste "+ ennemy.getVie() + " de pts de vie");
			this.setMagie(getMagie()-2);
			System.out.println(this.getNom()+ " lui reste "+ this.getMagie()+ " de mana");
		}
	}


}
