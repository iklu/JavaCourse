import java.util.Scanner;

/**
 * N!=N*(N-1)!
 */
public class Factorial {
	public static void main(String args[]){
	    //scanner to get input from user
        Scanner console = new Scanner(System.in);  
        
        System.out.print("n=");
        
        int n = console.nextInt();        

        int fact = 1;
        
        for(int i=1; i<=n; i++) {
        	fact = fact * i;
        	System.out.print(i);
        	if(i!=n)
                System.out.print( " x ");
        }
    	System.out.println(" = "+fact);
	}
}
