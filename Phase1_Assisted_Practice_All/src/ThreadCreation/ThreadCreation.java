//You are given a project to demonstrate the implementation of thread creation mechanisms.

package ThreadCreation;


public class ThreadCreation extends Thread{  
	
	public void run(){  
	  System.out.println("thread is running...");  
	}  
	
	public static void main(String args[]){  
	
		ThreadCreation t1=new ThreadCreation();  // Step 1: create the object of the class
		t1.start();  							// Step 2: starting the thread
	}  
}  
