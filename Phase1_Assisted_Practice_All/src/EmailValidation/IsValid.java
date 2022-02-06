package EmailValidation;
import java.util.regex.*;
import java.util.*;
	
public class IsValid{
	
	public static boolean isValid(String email){
		
		//email validation regex exp
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern = Pattern.compile(regex);
		if (email == null)
			return false;
		return pattern.matcher(email).matches();
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		String email[]=new String[4];
		
		System.out.println("Enter the no of emails you want to search: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the emails you want to search: ");
		for(int i=0;i<=n;i++){
			
			email[i]=sc.nextLine();
		}
		for(int i=1;i<=n;i++){
			
			//boolean returns weather the value is true or false
			boolean result = isValid(email[i]);
		
			if (result == true)
				System.out.println("Provided email address "+ email[i]+ " is valid \n");
			else
				System.out.println("Provided email address "+ email[i]+ " is invalid \n");
		}
	}

}
