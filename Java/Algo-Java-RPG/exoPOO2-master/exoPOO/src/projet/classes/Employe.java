package projet.classes;

public class Employe extends Personne{

	private double salaire;
	



	public Employe(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}





	@Override
	public String toString() {
		
		return "Employe [salaire=" + salaire + super.toString()+"]";
	}





	/************************************************************/
	/******************** ACCESSEURS  ********************/
	/************************************************************/
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
}
