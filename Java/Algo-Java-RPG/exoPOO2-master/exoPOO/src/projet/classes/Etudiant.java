package projet.classes;

public class Etudiant extends Personne{

	private String cne;
	
	

	public Etudiant(String nom, String prenom, String cne) {
		super(nom, prenom);
		this.cne = cne;
	}



	



	@Override
	public String toString() {
		return "Etudiant [cne=" + cne + super.toString()+ "]";
	}







	/************************************************************/
	/********************  ACCESSEURS  ********************/
	/************************************************************/
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}
	
	
}
