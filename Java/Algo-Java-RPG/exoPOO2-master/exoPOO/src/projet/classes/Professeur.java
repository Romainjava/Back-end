package projet.classes;

public class Professeur extends Employe {
	
	private String specialite;
	
	


	public Professeur(String nom, String prenom, double salaire, String specialite) {
		super(nom, prenom, salaire);
		this.specialite = specialite;
	}




	@Override
	public String toString() {
		return "Professeur [specialite=" + specialite + super.toString()+"]";
	}




	/************************************************************/
	/********************  ACCESSEURS  ********************/
	/************************************************************/
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	
}
