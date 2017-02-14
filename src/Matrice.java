import java.util.Scanner;

/**
 * n = 2
 *
 * 1*1
 * 1*2
 * 2*1
 * 2*2
 *
 *
 *
 */
public class Matrice {
	public static void main(String args[]){
		
		Scanner console = new Scanner(System.in);
		
		int n = console.nextInt();

		int s = Integer.toString(n*n).length()+1;
		
		for (int i = 1; i<=n; i++){
			for (int j = 1; j<=n; j++){

				int prod = j*i;

				System.out.format("%-"+s+"s", prod);
			}
			System.out.print("\n");
		}

		for (int i = 1; i<=n; i++){
			for (int j = 1; j<=n; j++){

				int prod = j*i;

				System.out.format("%-"+s+"s", j+" x " + i +" = "+prod);
				System.out.print("\n");
			}
			System.out.print("\n");
		}


		
	}
}
