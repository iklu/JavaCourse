package Operators;

public class ShiftOperator {

	 public static void main(String[] args) {
		 
		 
		  Byte b = Byte.parseByte("00101011",2);		  
		  System.out.println(b);
		  
		  
		  byte val = b.byteValue();
		  Byte shifted = new Byte((byte) (val >> 2));
		  System.out.println(shifted);

		  // often overloaded  are the methods of Integer

		  int i = Integer.parseInt("00101011",2);
		  System.out.println( Integer.toBinaryString(i));
		  i >>= 2;
		  System.out.println( Integer.toBinaryString(i));
	 }

}
