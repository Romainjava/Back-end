package projet.classes;

public class Personne {

	private int id;
	private String nom;
	private String prenom;
	
	/************************************************************/
	/********************CONSTRUCTEUR ********************/
	/************************************************************/
	public Personne(String nom, String prenom) {
		++id;
		this.nom = nom;
		this.prenom = prenom;
	}

	
	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom +"]";
	}





	





	/************************************************************/
	/******************** ACCESSEURS   ********************/
	/************************************************************/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
