package fileOne;

public class CheckPalindrome {
	
	public static void checkPalindrome(String testData) {
		String cleanData = testData.replaceAll("^[!44]","");
		System.out.println(cleanData);
		String reverseString ="";
		int stringLength = cleanData.length();
		for(int i=stringLength-1;i>=0;i--) {
			reverseString = reverseString + cleanData.charAt(i);
		}
		if(cleanData.equals(reverseString)) {
			System.out.println("The Given test data "+testData+"  is a Palindrome");
		} else {
			System.out.println("The Given test data "+testData+"  is not a Palindrome");
		}
	}
	
	public static void main(String[] args) {
		String testData = "A man, a plan, a canal: Panama";
		CheckPalindrome.checkPalindrome(testData);
	}
}
