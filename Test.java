package coding_problems;

public class Test {

	public static void main(String[] args) {
		Integer a = 100, b = 100, c = 200, d = 200;
		System.out.println("a == b : " + (a == b));
		System.out.println("a == b : " + (c == d));
	/*:in wrapper classes if you assign byte range (_128 to +127)values to any number wrapper class ref
	 *  variable only one obj is created pointed by multiple ref var that's y in 1st case
	 *  (ur given value 100) 
	 *  true will be the o/P
	 
		If u assign other than byte range values 2 diff obj are created that's y in 2nd case false */
 	
	}

}
