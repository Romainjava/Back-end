package semaine9;

public class Voiture {

//attribut toujours définit en amont
		private String couleur; 
		private int porte;
		private String marque;
		
		//affichage
		public String getCouleur() {
			return couleur;
		}
		//modification
		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
		public int getPorte() {
			return porte;
		}
		public void setPorte(int porte) {
			this.porte = porte;
		}
		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
/*
 * methode pour m'afficher tout dans le main
 */
public String affichage() {
	//System.out.println(" Voici Couleur "+ getCouleur()+ "\n voici le nombre de portes "+ getPorte()+ "\n voici la marque "+ getMarque() );
	
	return " Voici Couleur "+ getCouleur()+ "\n voici le nombre de portes "+ getPorte()+ "\n voici la marque "+ getMarque()+"\n"+"\n";
}
		//mais oui c'est clair pas de point parceque voila
		
		
	

}
