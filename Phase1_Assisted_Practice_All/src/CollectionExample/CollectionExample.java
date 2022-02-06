//You are given a project to demonstrate the multithreading with and without synchronization.

package CollectionExample;

public class CollectionExample implements Runnable{

	public static void main(String[] args) {
		
	    {    
	    	CollectionExample r1=new CollectionExample();    

	    	CollectionExample r2=new CollectionExample();    
	        Thread thread1 =new Thread(r1);    
	        Thread thread2 =new Thread(r2); 
	        thread1.start();    
	        thread1.start(); 
	    }  

	}

	@Override
	public void run() {
		System.out.println("Thread is running..."); 
	}

}
