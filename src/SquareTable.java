import java.util.*;

/*class to print the square table of the user input
 * input -> 5,
 * output -> 5 * 1, Square: 25
 * */
public class SquareTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int value, i;
		
		System.out.println("Enter the value: ");
		value = sc.nextInt();
		
		for(i=1; i<=10; i++) {
			
			System.out.println(value + " * " + i + ", Square: " + ((value * i )*(value * i)) + "\n" );
		}

	}

}
