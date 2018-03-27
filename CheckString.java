package coding_problems;

public class CheckString {

	public static void main(String[] args) {
		String s = "abcdefabccabc";
		String in = "abc";
		CheckString cs = new CheckString();
		int out = cs.findOccurrence (s, in);
		if (out!=0) {
			System.out.println("String "+in+" appears "+out+" times");
		}
	}
 
	private int findOccurrence(String s, String in) {
		int cnt = 0;
		for (int i =0; i<=s.length()-in.length();i++) {
			if (s.substring(i,i+in.length()).equals(in)) {
				cnt++;
			}
		}
		return cnt;
		
	}

}
