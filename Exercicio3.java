import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner user= new Scanner(System.in);
		int j=0;
		int[] a = new int [10];
		for (int i=0; i<a.length;i++){
			System.out.println("Insira um n�mero para a "+(i+1)+"�" +" posi��o:");
			a [i]= user.nextInt();
		}
		boolean p;
		for (int i=0; i<a.length;i++){
			 p = true;
			
			for ( j = 2; j<a[i]; ) {
				if (a[i] % j==0)
					p = false;
				break;
			}
			
			if (p) {
				System.out.println("O n�mero "+a[i]+ " � primo");
			}else {
				System.out.println("O n�mero "+a[i]+ " n�o � primo");
			}

			user.close();
		}
	}
}