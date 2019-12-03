import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner (System.in);
		
		int i = 0;
		int j = 0;
		int[] a = new int [10];
		for(i=0;i<a.length;i++) {
		System.out.println("Insira o valor desejado:");
		a[i]=user.nextInt();
		System.out.println(" os numeros pares até o valor "+a[i]+ " são :");
		for(j=0;j<a[i]+1;j=j+2) {
			System.out.print(j+" ");
			System.out.println(" ");
		}
		}

		user.close();
	}
}