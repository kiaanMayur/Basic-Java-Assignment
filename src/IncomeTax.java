import java.util.Scanner;

/*class to calculate the taxable amount for a particular group of salary limit*/
public class IncomeTax {
	
		//method to calculate the income tax 
		public static double calculateIncomeTax(double income) {
			
			if(income > 0 && income <= 1_80_000)
				return income;

			else if(income > 1_80_000 && income <= 3_00_000)
				return (0.1 * income);
			
			else if(income > 3_00_000 && income <= 5_00_000)
				return (0.2 * income);
			
			else if(income > 5_00_000 && income <= 10_00_000)
				return (0.3 * income);
			
			else
				return 0.0;
		}
	
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			double income, payableTax;
			
			System.out.println("Enter the income:\n");
			income = sc.nextDouble();
			
			payableTax = calculateIncomeTax(income);
			
			if(payableTax == income)
				System.out.println("You dont have to pay tax.");
			
			else if(payableTax == 0.0)
				System.out.println("Invalid Amount!");
			
			else
				System.out.println(payableTax + " is the payable Tax.");
			
			sc.close();
		}
}