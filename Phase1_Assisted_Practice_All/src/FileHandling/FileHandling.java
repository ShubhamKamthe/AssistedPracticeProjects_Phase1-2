//You are given a project to demonstrate the create, read, update, and delete operations on the files in Java.


package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {

		public static void main(String[] args) throws IOException{
			
			/*-------------------create a new file-----------------------*/
			
			Scanner sc= new Scanner(System.in);
			System.out.println("\nEnter the file name with the directory: ");
			String name=sc.nextLine();
			String path="C:\\Users\\shubh\\Desktop\\final\\";
			//System.out.println(path+name);
			File f1=new File(path+name);
			f1.createNewFile();
			System.out.println("File created....\n");
			//f1.close();
			

			/*-------------------read a file-----------------------*/

			System.out.println("\nReading the file.... ");
			File f3=new File("C:/Users/shubh/Desktop/final/ab");
			BufferedReader br= new BufferedReader(new FileReader(f3));
			String st;
			while ((st = br.readLine()) != null)
	            System.out.println(st);
			
			/*-------------------delete a new file-----------------------*/
			
			
			System.out.println("\nEnter the file name that you want to delete with the directory: ");
			String name2=sc.nextLine();
			File f2=new File(path+name2);
			
			if(f2.delete()){
				System.out.println("File " + f2.getName() + " is deleted....\n");
			}
			else {
		        System.out.println("Delete operation failed....\n");
		    }
			
			System.exit(0);
			
		}

	}






