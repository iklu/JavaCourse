import java.util.Scanner;


public class FactorialOdd {
	public static void main(String args[]){
		
		Scanner console = new Scanner(System.in);
		
		int n = console.nextInt();

		int s = Integer.toString(n*n).length()+1;
		
		for (int i = 1; i<=n; i++){
			for (int j = 1; j<=n; j++){
				
				int prod = i*j;

				System.out.format("%-"+s+"s", prod);
			}
			System.out.print("\n");
		}
		
	}
}
