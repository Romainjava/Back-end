package semaine4;

public class Exo3 {

	public static void main(String[] args) {
		
		int tab1[][] = {{2,4,5}, {3,33,32}};
		int tab2[][] = {{3},{3,4,5},{3,5},{3,1,0}};
		
		for(int x=0; x<tab1.length; x++) {			/* je parcours le tableau avec 1er variable*/
			for(int j=0; j<tab1[x].length; j++) {	/* tab1[x] il se base l'index x si on le met pas
			 										il n'affiche pas le dernier chiffre du tableau soit 5 */
				System.out.println("1er tableau " + tab1[x][j]);
			}
		}
		for (int x=0; x<tab2.length; x++) {
			for(int j=0; j<tab2[x].length; j++) {
				System.out.println("2eme tableau " + tab2[x][j]);
				
			}
		}
		
		
	
	}
}
