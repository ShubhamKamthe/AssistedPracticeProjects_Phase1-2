//Write a program to demonstrate different methods of different return types.

package MethodReturnType;

public class ReturnType {
	
	void new1(){
		System.out.println("This is a void return type method");
	}
	int new2(){
		System.out.println("This is a integer return type method");
		return 1;
	}
	double new3(){
		System.out.println("This is a double return type method");
		return 30.4;
		
	}

	public static void main(String[] args) {
		ReturnType ob=new ReturnType();
		ob.new1();
		System.out.println("The value returend in this method is "+ob.new2());
		System.out.println("The value returend in this method is "+ob.new3());

	}

}
