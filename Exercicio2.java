import java.util.Scanner;
public class Exercicio2 {

	public Exercicio2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int [5];
		Scanner user = new Scanner (System.in);
		for (int i=0; i<A.length;i++){
			System.out.println("Insira um número para a "+(i+1) +"° posição:");
			A [i]= user.nextInt();
		}
		for (int i=0; i<A.length;i++){
			System.out.println("Tabuada do "+A[i]+":");
			
			for (int j = 1; j<=10; j++) {
				System.out.println(+A[i]+"x"+j+"="+(A[i]*j));
			}
		}
		user.close();	
	}
}