
import java.util.Scanner;

/*class which has initial username and password and check from user if user has given correct 
username & password or not (max 3 attempts)*/
public class CUILogin {
	
	//default values of password & username
	static String defaultPassword = "password";
	static String defaultLoginName = "matripat";
	static int count=0;
	
	//method to check if the user has given correct credentials or not
	public static int checkValidation(String loginName, String password) {
		
		if(loginName.equals(defaultLoginName) && password.equals(defaultPassword))
			return -1;
		else 
			return count++;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String loginName = new String();
		String password = new String();

		int result;
		
		//do-while loop to insert the credentials atleast one
		do {
			
			System.out.println("Enter the details:\nLogin name:\t");
			loginName = sc.nextLine();
			System.out.println("Password:\t");
			password = sc.nextLine();
			
			result = checkValidation(loginName, password);
			
			if(result == -1)
				System.out.println("Welcome " + loginName);
			
			else if(result == 2) {
				System.out.println("Contact Admin");
				System.exit(0);
			}
			
		}while(result < 2);
		
	}

}
