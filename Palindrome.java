package coding_problems;

public class Palindrome {
	 boolean isPalindrome(String input) {
	        int stringLength = input.length();
	        int indexLastElement = stringLength -1;
	        for (int i = 0; i < stringLength / 2; i++) {
	            if (input.charAt(i) != input.charAt(indexLastElement - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
        System.out.println("madam is palindrome : " +palindrome.isPalindrome("madam"));
        System.out.println("running is palindrome : "+palindrome.isPalindrome("running"));
   
	}

}
