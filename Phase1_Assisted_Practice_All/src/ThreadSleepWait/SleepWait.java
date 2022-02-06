//You are given a project to demonstrate the execution of sleep(), wait(), and its uses in the threading concept.

package ThreadSleepWait;

public class SleepWait {
	
	//create an instance of the Object   
    private static Object obj = new Object();   
  
    //main() method starts with handling InterruptedException  
    public static void main(String[] args) throws InterruptedException   
    {   
          
        //pause process for two second  
        Thread.sleep(2000);   
          
        //print custom statement  
        System.out.println( Thread.currentThread().getName() + " Thread is woken after two second");   
          
        //create synchronizec context from which we call Wait() method  
        synchronized (obj)    
        {   
            //use wailt() method to set obj in waiting state for two seconds  
            obj.wait(2000);   
  
            System.out.println(obj + " Object is in waiting state and woken after 2 seconds");   
        }   
    }   
}
