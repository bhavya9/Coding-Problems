package coding_problems;

public class StringReverse {

	public static void main(String[] args) {
		String string = "whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(reverse);
	}

}
