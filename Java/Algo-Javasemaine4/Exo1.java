package semaine4;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrez un chiffre");
		try {
			int x = sc.nextInt();
			System.out.println("Un deuxieme chiffre");
			int i = sc.nextInt();
			int j = x + i;
			System.out.println("Le résultat est " + j);
			}
		catch (Exception e) {		/* methode retour erreur qui fonctionne avec try */
				System.err.println("error 504");
			}
		System.out.println("fin");
		
   /*La methode try catch permet d'essayer le code (pour gerer les erreurs)
   et d'afficher une erreur dans le cas ou la saisie n'est pas bonne */


	
	}
}



/* methode de kévin 
 *      Scanner scanner = new Scanner(System.in);
        boolean verif = true;    
        do {
        System.out.println("Entrez un chiffre");
        String nombre1 = scanner.nextLine();
        System.out.println("Entrez un second chiffre");
        String nombre2 = scanner.nextLine();
        try {
        int cast1 = Integer.parseInt(nombre1);   /* ici je cast ma string dans un int
													si le string est un chiffre ca passe sinon 
													j'ai une erreur qui seras géré par try/catch**
        int cast2 = Integer.parseInt(nombre2);
        int sum = cast1+cast2;
        System.out.println("la somme de vos deux chiffres est : "+sum);
        verif=true;
        }
        catch (Exception e) {
            System.err.println("Vous n'avez pas entrez de chiffre");
        }

        
    }while (verif=true);

}
*/
