package coding_problems;

import java.util.HashMap;
import java.util.Map;

public class ForEachJava8 {

	public static void main(String[] args) {
		Map<String, Integer> stumarks = new HashMap<>();
		stumarks.put("Sai", 65);
		stumarks.put("Vamshi", 65);
		stumarks.put("Mahendar", 76);
		stumarks.put("Muni", 87);
		stumarks.put("Manohar", 90);

		stumarks.forEach((k,v)->System.out.println(k + "marks: " + v));
		}

	}
