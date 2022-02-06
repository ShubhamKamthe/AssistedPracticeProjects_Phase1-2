//Write a program to search a string entered by a user from the array of strings.

package ArrayString;

import java.util.Scanner;

public class ArrayStringExample {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			String[] strArray=new String[10];
			
			
			System.out.println("Enter the Size of the array: ");
			int arraylength=sc.nextInt();
			
			//taking the user input from the console
			System.out.println("Enter the String to the array: ");
			for(int i=0;i<=arraylength;i++){
				strArray[i]=sc.nextLine();
			}
			
			
			boolean found = false;
			int index = 0;
			
			//checking wether the string is present in the array or not
			System.out.println("Enter the string that you want to search: ");
			String s =sc.nextLine();
			for (int i = 0; i <= arraylength; i++) {
				if(s.equals(strArray[i])) {		//comparing the string with the array
					index = i; 
					found = true;
					break;
				}
			}
			if(found)
				System.out.println(s +" found at the index."+index);
			else
				System.out.println(s +" not found in the array.");

		}

	}


