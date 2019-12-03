import java.util.Scanner;
public class Exercicio1 {

	public Exercicio1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner (System.in);
		int[] A = new int [20];
		int[] B = new int [A.length];
		
		for (int i=0; i<A.length; i++) {
			System.out.println("Insira um número para a "+(i+1)+"°" +" posição:");
			A [i]= user.nextInt();
		}
		int pB = 0;
		
		for (int i=0; i<A.length; i++) {
			if (A[i]%2==0) {
				B[pB]= A[i];
				pB++;
		}
	}
		for (int i=0; i<A.length; i++) {
			if (A[i]%2 !=0) {
				B[pB]= A[i];
				pB++;
		}
	}
		System.out.println("Vetor A ");
		for (int i = 0; i<A.length; i++) {
			System.out.println(A[i] + "");
		}
		System.out.println();
		
		System.out.println("Vetor B ");
		for (int i = 0; i<B.length; i++) {
			System.out.println(B[i] + "");
		}
		user.close();
	}
}