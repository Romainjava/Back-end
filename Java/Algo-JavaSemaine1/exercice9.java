package javatest;

class exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a19 = 0;
		int a20 = 0;
		int a40 = 0;
		int a100 = 0;
		int age = 0;
							// Mes multiples variables qui vont me servir  pour le calcul dans la boucle do */
			do{            // "Do" ma boucle pour cet exercice */
				System.out.println("Quel âge avez-vous ?");
				 age = sc.nextInt(); // entrée utilisateur */
				 		//Ma variable utilisateur qui va me permettre de stock et calculer  */
				 if (age < 20)
				 	{
					 a19++; // variable stock */
				 	} 
				 else if (age >= 20 && age <= 40)
				 	{
				 		a20++; // else if qui est un type de variable qui me permet de mettre une autre condition (if) */
				 	}
				 else if (age > 40 && age < 100)
				 	{
				 		a40++; // variable stock */
				 	}
				 else // Mon else qui vient finir ma dernière condition */
				   {
					 	a100++; // variable stock */
				   }
			   }while (age < 100); // mon while qui vient arrêter la boucle quand le chiffre 100 est ajouté */
			
				System.out.println("1 à 19 =" + a19 + "|| 20 à 40 =" + a20 + "||  41 et + ="  + a40 + "|| le centenaire l'unique =" + a100);
				// écriture systeme qui résume les calculs *//
						
		
		
	}

}
