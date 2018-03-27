package coding_problems;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8ArrayStreamExample {

	public static void main(String[] args) {
		Integer num[]={1,2,3,4,5,6};
	     
        Stream<Integer> stream = Arrays.stream(num);
        System.out.print("Values Before Filter : ");    
        stream.forEach(each->System.out.print(each+" "));
        System.out.println();
        System.out.print("Values After Filter : ") ;
        Stream<Integer> stream1 = Stream.of(num);
        Stream newS=stream1.filter(each->each.intValue()>3);
        newS.forEach(each->System.out.print(each+" "));  
        System.out.println();     
	}

}
