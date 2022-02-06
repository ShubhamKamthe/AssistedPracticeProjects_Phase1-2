//Write a program which will take a string as input and will convert it into other primitive data types.

package DataType;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string datatype: ");
		//String data=sc.nextLine();
		
		String data="20";					//taking string input
		int l=Integer.parseInt(data);		//converting string to integer
		System.out.println("String to Integer Convertion: "+l);

	}

}
