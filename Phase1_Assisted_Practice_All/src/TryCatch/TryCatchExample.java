//You are given a project to demonstrate the uses of try-catch blocks in Java.

package TryCatch;

public class TryCatchExample {

	public static void main(String[] args) {
		try{
			checkexcption();
			int a[]=new int[5];
			a[3]=30/0;
			
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}finally{
			System.out.println("Inside the finally block 1 ");
		}

	}
	public static void checkexcption(){
		try{
			int a[]=new int[5];
			a[5]=9;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}finally{
			System.out.println("Inside the finally block 2 ");
		}
	}

}


