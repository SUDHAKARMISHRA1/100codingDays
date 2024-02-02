package fileOne;

public class SomeOfGivenString {

	public static void getSum(String a, String b) {
		int dataOne = Integer.valueOf(a);
		int dataTwo = Integer.valueOf(b);
		int resultString = dataOne + dataTwo;
		String result = Integer.toString(resultString);
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		String dataOne = "12";
		String dataTwo = "13";		
		SomeOfGivenString.getSum(dataOne, dataTwo);
	}
}
