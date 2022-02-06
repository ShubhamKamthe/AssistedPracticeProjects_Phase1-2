//You are given a project to demonstrate the uses of the throws, throw, finally, and custom exceptions in Java.

package Throws;

public class ThrowsExample {


	   static void validate(int salary)throws InvalidAgeException{  
		     if(salary<2100){ 
		      throw new InvalidAgeException("you need to work hard"); 
		     }
		     else if(salary>2100 && salary<5000){  
		      System.out.println("your salary is somehow good");  
		     }
		     else{
		      System.out.println("your salary very good");
		     }
		   }  
		     
		   public static void main(String args[]){  
		      try{  
		        validate(2500);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }  
		      finally{
		    	  System.out.println("Have a greate future ahead...");  
		      }
		  }  
		}  

class InvalidAgeException extends Exception{  
	
		InvalidAgeException(String s){  
		  super(s);  
		 }

}
