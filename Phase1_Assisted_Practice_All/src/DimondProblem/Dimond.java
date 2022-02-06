//You are given a project to work and resolve the diamond problem using OOPs concepts.

package DimondProblem;


interface MyInterface1{
	   public static int num = 1330;
	   public default void display() {
	      System.out.println("display method for MyInterface1");
	   }
	}
	interface MyInterface2{
	   public static int num = 1320;
	   public default void display() {
	      System.out.println("display method for MyInterface2");
	   }
	}

public class Dimond implements MyInterface1, MyInterface2{
		   public void display() {
		      MyInterface1.super.display();
		      
		      MyInterface2.super.display();
		   }
		   public static void main(String args[]) {
			   Dimond obj = new Dimond();
		      obj.display();
		   }
		}