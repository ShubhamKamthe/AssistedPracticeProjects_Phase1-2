//You are given a project to demonstrate a program implementing the concept of exception handling available in Java and the custom exception handlers.

package CustomeException;


public class CustomeException{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not eligible to votess");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	        validate(17);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class InvalidAgeException extends Exception{  

	InvalidAgeException(String s){  
	  super(s);  
	 }  
}  
