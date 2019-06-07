package semaine4;

public class Permutation {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		//int tampon1;
		/*int tampon2;
        tampon1 = a;
        tampon2 = b;
        b= tampon1;
        a = tampon2;*/

		/*tampon1 = a;
        a = b;
        b = tampon1;*/
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println(a+" ok"+ b);


	}



}
