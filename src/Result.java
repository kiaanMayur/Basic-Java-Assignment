import java.util.Scanner;

/*class to display the result of students based upon their marks in 3 subjects
 * 60 above in all 3 subjects -> Pass
 * 60 above in any 2 subjects -> promoted
 * less than 60 in all or any 2 subjects -> fail
 * */
public class Result {
	
	//calculation of result
	public static void calculateResult(int[] marks ) {
		
		int i, counter60=0;
		
		for(i=0; i<3; i++){
			if(marks[i] > 60)
				counter60++;	
		}
		
		if(counter60 == 1)
			System.out.println("Fail!!!");
		else if(counter60 == 2)
			System.out.println("Promoted!!!");
		else if(counter60 == 3)
			System.out.println("Pass!!!");
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[3];
		int i ;
		
		System.out.println("Enter the marks of Physics, Chemistry and Maths: \n");
		
		for(i=0; i<3; i++)
			marks[i] = sc.nextInt();
		
		calculateResult(marks);
	}
}