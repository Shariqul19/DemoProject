package map;

import java.util.HashMap;
import java.util.Map;

// Map key value pair data set
// Key - Uniquely indentity
// Value - Duplicate allow
// Null value and Null Key 
// enterySet() - fetch record
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMap();
	}
	// not in ordered
	public static void hashMap() {
	HashMap<String,String> data=new HashMap<String,String>();
	data.put("FirstName", "Mohmmad");
	data.put("LastName","Shahnawaz");
	data.put("Email", "kazonline@gmail.com");
	//fetch data
	for(Map.Entry<String,String> m:data.entrySet()) {
		System.out.println("Key -> "+m.getKey()+"    Value ->"+m.getValue() ); // Show key
		//System.out.println(m.getValue());
	}
	}
	/*
	# FirstName - Mohmmad
	# LastName -Shahnawaz
	#Emal - kazonline@gmail.com
*/
}