package ArraySearch;

public class ArraySearchExp {

	public static void main(String[] args) {
		String[] strArray = { "Ram", "Sam", "Tom" };
		boolean found = false;
		int index = 0;
		String s = "Sam";
		for (int i = 0; i < strArray.length; i++) {
			if(s.equals(strArray[i])) {		//comparing the string with the array
				index = i; 
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(s +" found at the index "+index);
		else
			System.out.println(s +" not found in the array");

	}

}
