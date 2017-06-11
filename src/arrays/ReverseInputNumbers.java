package arrays;

/**
 * Created by ovidiu on 08-Jan-17.
 */
public class ReverseInputNumbers {
    public static void main(String[] args) {
        int[] numbers;
        int count;
        int num;

        numbers = new int[100];
        count = 0;
        System.out.println(numbers.length);

        System.out.println("Enter up to 100 positive integers; enter 0 to end.");
        while(true){
            System.out.print("? ");
            num = TextIO.getlnInt();
            if(num <= 0) {
                break;
            }
            numbers[count]=num;

            count++;
        }
        System.out.println("Your numbers in reverse mode are: ");

        int i=0;

        for( i = count - i; i>=0; i--){
            System.out.println(numbers[i]);
        }
    }
}
