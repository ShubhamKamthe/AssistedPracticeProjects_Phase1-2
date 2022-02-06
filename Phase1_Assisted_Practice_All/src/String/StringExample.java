//Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.

package String;

public class StringExample {

	public static void main(String[] args) {
		
		//string are immutable in nature
		String str="Simpli";
		
		
		//converting the string object to StringBuffer object
		StringBuffer s1= new StringBuffer(str);
		//reversing the string using the reverse method
		s1.reverse();
		System.out.println(s1);
		
		//converting the string object to StringBuilder object
		StringBuilder s2= new StringBuilder(str);
		//concating the string using the append method
		s2.append("learn");
		System.out.println(s2);
	}

}
