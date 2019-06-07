package exo1;

public class Voiture {
	//attribut
	private String couleur;
	private String marque;
	private int porte=3;

	public Voiture(String marque) {
		System.out.println("creation d'une voiture de marque :" + marque);
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getMarque() {
		return marque;
	}
	private void setMarque(String marque) {
		this.marque = marque;
	}
	public int getPorte() {
		return porte;
	}
	public void setPorte(int porte) {
		this.porte = porte;
	}
	public void affiche() {
		System.out.println(couleur + " "+ marque+ " "+ porte );

	}
	public static void affiche3(Voiture uneVoiture){ // static pas besoin d'instancié comme exemple "Array.toString()
		System.out.println(uneVoiture.couleur + " "+ uneVoiture.marque+ " "+ uneVoiture.porte );

	}
}
