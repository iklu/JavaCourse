
public class Array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] numbers = {10, 2, 3, 5, 45, 86};
		
		for(int x: numbers){
			if (x == 3) {
				System.out.println(x);
			}
		}
		
		for(int x = 0; x< numbers.length; x++){
			System.out.println(numbers[x]);
		}
	}
}
