package RWA;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ReadWriteAppend {
   public static void main( String[] args ) {

      try {

          System.out.println("Creating a new  file.... ");
         String data = "Something Doing Big";
         File f1 = new File("C://Users//shubh//Desktop//final//aa.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }
         
         System.out.println("\nAppending text in the file.... ");
 		 String path = "C:\\Users\\shubh\\Desktop\\final\\aa.txt";
 		 
         FileWriter fileWritter = new FileWriter(path,true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         
         String text="New data added";
         bw.write(text);
         bw.close();
         
         System.out.println("Done");
         
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}