package coding_problems;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,String> treeMap = new TreeMap<String, String>();
        treeMap.put("a", "apple");
        treeMap.put("c", "cherry");
        treeMap.put("p", "pear");
        // create a submap here with limits c till n
        SortedMap<String, String> subMap = treeMap.subMap("c", "n");
        System.out.println("Value of treeMap and subMap before modification...");
        System.out.println(treeMap);
        System.out.println(subMap);
        subMap.put("m", "mango");
        System.out.println("Value of treeMap and subMap after modification...");
        System.out.println(treeMap);
        System.out.println(subMap);
	}

}
