package semaine4;

import java.util.Scanner;

/**
 * Écrire un programme qui lit un mot au clavier et qui indique combien de fois sont
présentes chacune des voyelles a, e, i, o, u ou y, que celles-ci soient écrites en
majuscules ou en minuscules, comme dans cet exemple :
 */
public class Exo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int a = 0 , e = 0 , i = 0, o = 0, u = 0, y = 0;
		char[] tabVoyelle = {'a','e','i','o','u','y'};
		for(int x = 0;x<str.length();x++) {
			for (int j = 0; j<tabVoyelle.length;j++){
				if(str.charAt(x) == tabVoyelle[0]) {
					a++;
				}


			}

		}
		System.out.println(a-5);
	}
}
