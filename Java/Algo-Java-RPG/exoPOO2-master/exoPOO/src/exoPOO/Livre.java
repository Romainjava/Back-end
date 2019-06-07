package exoPOO;

public class Livre {

	private int id;
	private String titre;
	private String auteur;
	private int prix;
	private static int count = 1;



	/*******CONSTRUCTEUR********/

	public Livre(String titre, String auteur, int prix) {
		id= count;
		count++;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}


	/*******METHODE toString *********/

	@Override
	public String toString() {
		return "Livre num "+ this.id +" [ Le titre " + titre + ", de l'auteur " + auteur + ", et son prix " + prix + "]";
	}



	/*********ACCESSEURS************/
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Livre.count = count;
	}

}
