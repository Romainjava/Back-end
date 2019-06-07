package semaine2;

import java.util.Scanner;

class exo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez votre mots");
		String str = sc.nextLine();
		int startP = 0;											//*ma variable qui calcule de la case 1
		int endP = str.length() -1; 							//* ma variable qui calcule par la fin -1
		
		boolean isPal = true; // ma boolean 
		
			while(startP < endP) 								//* ma boucle qui vérifie la concordance entre les deux*/
			{	String begin = str.substring(startP,startP +1); //* Ma variable qui retient les lettres et les vérifie une par une
				String theEnd = str.substring(endP, endP +1);	//* Ma variable qui retient les lettres mais par la fin 
				startP++; 										//* le calcul de nombre de case qui font sauté les cases 1 par 1 et se stock dans begin
				endP--;											//* pareil mais par la fin et qui se stock dans theEnd
				if(begin.equalsIgnoreCase(theEnd)==false) 		//*equalsIgnoreCase me permet de faire un == mais en + il ignore si l'utilisateur à mis une maj et met tous en mini*/
				{	isPal=false;
					break;
				}
			}													//* fin de ma boucle while qui après avoir vérifié les cases se stop avec ma boolean et stocké dans mon else
				if(isPal == true) 
				{
				System.out.println(str+ " est un palindrome"); 	//* si c'est vrai c'est annoncé
				
				}
			
			
			else 
				{
				System.out.println(str+ " n'est pas un palindrome");
				}												//* ma boolean stocké dans mon while 
					
	}

}
