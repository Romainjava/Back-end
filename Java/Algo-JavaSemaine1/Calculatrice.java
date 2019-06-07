package javatest;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Boolean verif = true; //* creation  de la variable de type  boorean
		
         while (verif) //*création de la boucle erreur "tant que"
         { 
        System.out.println("Veuillez saisir un premier nombre entre -1000 et 1000 :"); //* crée la condition
        int ent1 = sc.nextInt(); //* j'intégre mes entiers 

        System.out.println("Veuillez saisir un deuxième nombre entre -1000 et 1000 :");
        int ent2 = sc.nextInt();

        sc.nextLine(); //* permet de vider les lignes (obligatoire)
        
        System.out.println("Veuillez saisir un opérateur :");
        String operateur = sc.nextLine();
        
       if ((ent1 > -1000) && (ent1 < 1000) && (ent2 > -1000) && (ent2 < 1000)) //* j'ai voulu crée la condition
        
       {
            switch (operateur)
            {
                case "*":
                    System.out.println(ent1 + "X" + ent2 + "=" +(ent1 * ent2));
                    verif = false;
                    break;
                
                case "/":
                    
                	if ((ent1 != 0) && (ent2 != 0)) //* != "est different de"
                	{
                        System.out.println(ent1 + "/" + ent2 + "=" + (ent1 / ent2));
                    verif = false;
                	}
                    else //* = "sinon" avec if ça sera toujours comme ça
                    {
                        System.out.println("Erreur de saisie chiffre");//*condition 
                    }
                    break;
                case "-":
                    System.out.println(ent1 + "-" + ent2 + "=" + (ent1 - ent2));
                    verif = false;
                    break;
                default:
                    System.out.println("opération impossible additionner par défaut");
                	System.out.println(ent1 + "+" + ent2 + "=" + (ent1 + ent2));
                    break;
                   
            }
            
        } //*token de fin if
       else {
       	System.out.println("Opération impossible veuillez re saisir un nombre");
       //* j'aurai voulu crée un espace entre le méssage d'erreur et le boorean, je n'ai pas trouvé
      	
       }//* token de fin "else"
	}

}

}