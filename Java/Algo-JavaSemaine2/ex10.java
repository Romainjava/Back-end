import java.util.Scanner;

class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tab1[] = {4, 67, 25, 87};
		double tab2[] ={4.5, 67, 25.50, 87.00};
		char tab3[] = {'r', '2', '?' , '+'};
		String tab4[] = {"Robert", "Noemie", "David" , "Bertrand"};
		// mes types de var + mes var initialiser */
		
		System.out.println("Nous avons en 1er place du tableau 1 le chiffre " + tab1[0]);
			
			int remp = tab1[2] = remp = 42; //remplacement du 25(tableau) par 42 */
		System.out.println("La valeur 3 du tableau devient 42");		
		System.out.println("à l'emplacement 3 du tableau 1 nous avons " + tab1[2]);
		
			for(int i = 0; i < tab3.length; i++)
		{
			System.out.println("En valeur " + i + " nous avons " + tab3[i]);
		}	
		System.out.println("afficher la taillee du tableau 1 = " + tab1.length);
	
	
	}

}
