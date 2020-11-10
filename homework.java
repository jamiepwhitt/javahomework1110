import java.util.Scanner;
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter username");

    String userName = myObj.nextLine();  
    System.out.println("Username is: " + userName);  
	

		int decVal= 26; 
		//correct
		float pi = 3.14_15F;
		//incorrect underscores have to be located within digits
		float pi1 = 3_.1415F;
		//correct
		long socialSecurityNumber = 999_99_9999L;
		//incorrect
		long socialSecurityNumber1 = 999_99_9999_L;
		//incorrect 
		int x8 = 0x52_;
	}
	
}

