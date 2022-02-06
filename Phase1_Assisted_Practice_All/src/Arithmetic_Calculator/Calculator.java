package Arithmetic_Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char ope;
		double n1, n2, result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation of your chooice : + - * / ");
		ope= sc.next().charAt(0);
		
		 System.out.println("Enter first number");
		 n1 = sc.nextDouble();

		 System.out.println("Enter second number");
		 n2 = sc.nextDouble();
		 switch (ope) {

	      // performs addition between numbers
	      case '+':
	        result = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    sc.close();
	  
	}

}
