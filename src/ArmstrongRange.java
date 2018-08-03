/*clas to print all the armstrong number between 100 and 999*/

public class ArmstrongRange {

	public static void main(String arg[]) {

		int i, temp, remainder, armstrongNumber = 0;

		System.out.println("Total armstrong numbers between 100 & 99 are:\n");
		
		for (i = 100; i <= 999; i++) {

			temp = i;
			armstrongNumber = 0;
			
			//logic of armstrong number
			while (temp > 0) {
				remainder = temp % 10;
				armstrongNumber += (remainder * remainder * remainder);
				temp /= 10;

			}
			
			if (armstrongNumber == i) {
				System.out.println(i + "\n");
				
			}
		}

	}
}