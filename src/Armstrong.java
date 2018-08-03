import java.util.Scanner;

/*class which takes a number from user and check whether a number is armstrong or not
 * armstrong no = sum of cube of all the digits is equal to number itself
 */
public class Armstrong {
	
	public static void main(String arg[]) {
	
	Scanner sc = new Scanner(System.in);
	int temp, number, remainder, armstrongNumber=0;
	number = sc.nextInt();
	temp = number;
	
	//logic to check the armstrong number
	while(temp > 0) {
		remainder = temp % 10;
		armstrongNumber += (remainder * remainder * remainder);
		temp /= 10;
		
	}
	
	if(armstrongNumber == number)
			System.out.println("True");
	else
			System.out.println("False");
	}
}