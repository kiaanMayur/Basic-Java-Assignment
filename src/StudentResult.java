
import java.util.Scanner;

/*class which takes marks of 3 students for 3 different subjects and print the total sum and average of class
and separate sum and average of each student*/
public class StudentResult {
	
	//method for class sum and average
	public static void totalSumAndAverage(int[][] marks ) {
			
			int i, j;
			double sumTotal = 0.0, averagetotal;
			for(i=0 ; i<3 ; i++) {
			
			for(j=0 ; j<3 ; j++) {
				sumTotal += marks[i][j];
			}
		}
		
		averagetotal = sumTotal / 9;
		
		System.out.println("The total marks of all the students are: " + sumTotal + " and the total average is: " + averagetotal);
	}
	
	//method for separate sum and average
	public static void seperateTotalAndAverage(int[][] marks) {
			
			int i, j;
			double seperateAverage, seperateTotal=0.0;
			
			for(i=0; i<3; i++) {
			
			System.out.println("The total of " + i+1 + "student is:");
			
			for(j=0 ; j<3 ; j++) {
				
				seperateTotal += marks[i][j];
			}
			seperateAverage = seperateTotal / 3;
			
			System.out.println(seperateTotal + " and average of student " + (i+1) + " is " + seperateAverage);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int marks[][] = new int[3][3];
		int i, j;
		
		for(i=0; i<3; i++) {
			
			System.out.println("Enter the marks of " + (i+1) + " student:\n");
			
			for(j=0; j<3; j++)
				marks[i][j] = sc.nextInt();
		}
		
		totalSumAndAverage(marks);
		seperateTotalAndAverage(marks);
	}

}




