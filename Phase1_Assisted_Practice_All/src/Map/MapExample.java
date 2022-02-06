//Write a program to demonstrate the uses of Map.

package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();	//cretaing HashMap object 
		//LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();	//cretaing LinkedHashMap object
		//TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 	//cretaing TreeMap object
		map.put(98,"Ram");
		map.put(38,"Sam");
		map.put(32,"Ranak");
		map.put(33,"Rama");
		
		
		//to remove an value using the key
		//map.remove(33);
		//size of map
		//System.out.println(map.size());
		
		System.out.println("Iterating Hashmap...");  
			for(Map.Entry m : map.entrySet()){    
				System.out.println(m.getKey()+" "+m.getValue());  
			}
	}

}
