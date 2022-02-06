package Constructor_Type;

public class ConstReturnType {
	
	ConstReturnType(){
		System.out.println("Inside the defult constructor...");
	}
	
	ConstReturnType(int a, int b){
		int a1=a;
		int b1=b;
		int r=a1+b1;
		System.out.println("Inside the parameterized constructor...");
		System.out.println("Addtion of two number is "+r);
	}

	public static void main(String[] args) {
		ConstReturnType ob1=new ConstReturnType();
		ConstReturnType ob2=new ConstReturnType(4,5);

	}

}
