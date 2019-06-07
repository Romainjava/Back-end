package semaine2;

import java.util.Scanner;

class exo17 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      String guessWord = ("illusion");
      String guess = " ";
      int i = 0;
      int essai= 10;
      boolean out = false;

      while(!guess.equals(guessWord) && !out)
  {  if(i < essai)
        {    i++;
          System.out.println("Go try ");
          guess = sc.nextLine();

      char guess1 = guess.charAt(0);
      for(int x = 0; x < guessWord.length(); x++) 
      {

          if(guess1 == guessWord.charAt(x))
          {
              System.out.println("tu as trouvé la lettre " + guessWord.charAt(x) + " en position " + (x+1) + "sur une base de 8 lettres");
          }

      }		// j'ai pas réussi à le finir à crée une autre variable pour stocké les bonnes réponses et le comparé à ma variable guessWord qui est le mot //
  }        if(i == essai) {
                  System.out.println("you lose");
                  }
          else {
              System.out.println("le mot étais bien " +guessWord);
               }
  }
}
}
