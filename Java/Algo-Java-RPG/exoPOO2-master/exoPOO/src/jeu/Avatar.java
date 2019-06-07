package jeu;

public abstract class Avatar {

	private String nom ="";
	private int power;
	private int vie;
	private int magie;
	private float gold;
	int potion = 2;





	public Avatar() {

	}



	/************************************************************/
	/******************** METHODE CLASSE ABSTRAIT   ********************/
	/************************************************************/
	abstract public void saluer(Avatar ennemy);
	abstract public void boireUnePotion();
	abstract public void attaquer(Avatar ennemy);




	/************************************************************/
	/********************  ACCESSEURS  ********************/
	/************************************************************/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	public int getMagie() {
		return magie;
	}
	public void setMagie(int magie) {
		this.magie = magie;
	}
	public float getGold() {
		return gold;
	}
	public void setGold(float gold) {
		this.gold = gold;
	}



	public int getPotion() {
		return potion;
	}



	public void setPotion(int potion) {
		this.potion = potion;
	}


}
