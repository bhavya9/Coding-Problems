package coding_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterUsingStreams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Chris", "HTML", "XML", "CSS");
		
		
		Stream<String> s = names.stream().filter(name -> name.startsWith("C"));
		System.out.println(s.collect(Collectors.toList()));

	}

}
