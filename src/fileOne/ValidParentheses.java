package fileOne;


public class ValidParentheses {

	public static void checkParentheses(String testData) {

		if(testData.length()<=1) {		
			System.out.println("Given input string "+testData+" is not valid Parentheses");
		}else {
			String newData = testData.replace("{}", "").replace("()", "").replace("[]", "");
			if(newData.length()==0) {
				System.out.println("Given input string "+testData+" is valid Parentheses");
			} else {
				System.out.println("Given input string "+testData+" is not valid Parentheses");
			}
		}
	}

	public static void main(String[] args) {
		String testData = "[()]";
		ValidParentheses.checkParentheses(testData);
	}
}














