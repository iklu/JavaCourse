
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
	      //scanner to get input from user
        Scanner console = new Scanner(System.in);  
        
        System.out.print("a = ");
        
        int a = console.nextInt();  
        
      String op = console.next();        
        
        boolean x = "+".equals(op); 
        
        if(x){
        	
        	System.out.print("+");
        	
        	op = "+";
        }        
        
        System.out.print("b = ");
        
        int b = console.nextInt();
        
        System.out.print(a);        
  
        
        int sum = a + b;
        
        System.out.print("a + b ="+ sum);
        
	}

}
