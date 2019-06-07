package semaine5;

import java.util.Scanner;
/*
 * Version re travailler de mon exo 7
 * tout commenté sur ma semaine 4
 */
public class Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine().toLowerCase();
		char user2[] = user.toCharArray();
		char voyelle[] = {'a','e','i','o','u','y'};
		int nVoy[] = new int[voyelle.length];

		for(int j=0; j<voyelle.length; j++) {
			for(int i=0; i <user2.length; i++) {
				if(user2[i]==voyelle[j]) {
					nVoy[j]++;
				}
			}
		}
		for(int i=0; i<voyelle.length; i++) {
			if(nVoy[i]!=0) {
			System.out.println("voy found "+ voyelle[i]+ " numbers "+ nVoy[i] );
			}
		}sc.close();
	}

}
