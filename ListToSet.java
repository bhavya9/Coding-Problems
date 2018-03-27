package coding_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Java");
		arrList.add("List to String");
		arrList.add("Example program");
		
		Set<String> strSet = new HashSet<String>(arrList);
		
		System.out.println(strSet);
	}

}
