package project3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {


		/*-------------------read a file-----------------------*/

		System.out.println("\nReading the file.... ");
		File f3=new File("C:/Users/shubh/Desktop/final/ab");
		BufferedReader br= new BufferedReader(new FileReader(f3));
		String st;
		while ((st = br.readLine()) != null)
            System.out.println(st);

		/*-------------------append and write a file-----------------------*/

		System.out.println("\nAppending text in the file.... ");
		String path = "C:\\Users\\shubh\\Desktop\\final\\ab";
	    String text = "Added text";
	    FileWriter fw = new FileWriter(path, true);
        fw.write(text);
        fw.close();

	}

}
