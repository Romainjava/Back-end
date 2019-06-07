package exo2;

import java.util.Collections;

public class ObjetTableau {

	private int n;
	private int tab[];
	private static int count=0;


	//constructeur avec en parametre int i
	public ObjetTableau(int i){
		count++;
	}

	//methode de class
	public int[] add(int nombre) {
		n = nombre;
		tab = new int[n];
		for (int i = 0; i < n; i++) {
			tab[i]= (int)(Math.random()*5+1);
		}
		return tab;

	}
	/**
	 * for each pour afficher le tableau
	 */
	public void affichage() {
		for (int i : tab) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
	/**
	 * methode qui retourne maxi
	 * @return
	 */
	public int maximum() {
		int	max = tab[0];
		for(int i=0; i<n; i++) {
			if(max<tab[i]) {
				max=tab[i];
			}
		}return max;
	}

	/**
	 * methode de minimum
	 * @return
	 */
	public int minimum() {
		int min = tab[0];
		for (int i = 0; i < n; i++) {
			if(min>tab[i]) {
				min=tab[i];
			}
		}return min;

	}
	/**
	 * calcul le total dans le tableau
	 * @return
	 */
	public int somme() {
		int som=0;
		for(int i=0; i<n; i++) {
			som += tab[i];
		}return som;
	}

	/**
	 * methode d'instance pour compté le nombre dégalité
	 * @param p retourne le nombre d'egalité 
	 * @return
	 */
	public int egal(int p) {
		int compteur = 0;
		for (int i = 0; i < n; i++) {
			if(tab[i]==p) {
				compteur++;
			}
		}
		return compteur;
	}
	/**
	 * methode d'instance pour compté les chiffres compris entre p et q
	 * avec un if pour regarder que p<q et un break pour évité d'afficher le syso plusieurs fois
	 * @param p
	 * @param q
	 * @return
	 */
	public int compris(int p, int q) {
		int compteur=0;
		for( int i = 0; i < n; i++) {
			if(tab[i]>=p && tab[i]<=q) {
				compteur++;
			}
			if(tab[i]<=p && tab[i]>=q) {
				System.out.println("p n'est pas inférieur à q veuillez changer les arguments");
				break;
			}
		}
		return compteur;
	}
	/**
	 * methode d'instance qui renvoie le 1er element du tableau (index 0)
	 * @param p
	 * @return
	 */
	public int premier(int p) {
		p = tab[0];
		return p;
	}
/**
 * methode d'instance pour le dernier element du tableau
 * @param p
 * @return
 */
	public int dernier(int p) {
		p = tab[tab.length -1];
		return p;
	}
	/**
	 * methode d'instance pour inverser le tableau
	 * obliger de faire un sysout ici car en void on peut pas l'afficher dans un sysou à partir du main
	 */
	public void inverse() {
		for(int i=0; i< n/2; i++) {
		int temp = tab[i];
		tab[i] = tab[tab.length - i -1];
		tab[tab.length - i -1] = temp;
		
		}
		for (int i = 0; i < n; i++) {
			System.out.print("voici le tableau en inverser" +tab[i]);
		}
		
	}
	
	//getter
	public int getN() {
		return n;

	}

	public static int getCount() {
		return count;
	}



	//setter
	public void setN(int n) {
		this.n = n;
	}
	public int[] getTab() {
		return tab;
	}
	public void setTab(int tab[]) {
		this.tab = tab;
	}



}
