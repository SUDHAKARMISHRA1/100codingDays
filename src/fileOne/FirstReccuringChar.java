package fileOne;

public class FirstReccuringChar {

	public static void getRecurringChar(String testData) {
		int dataLen = testData.length();
		for(int index=0;index<dataLen-1;index++) {
			if(testData.charAt(index)==testData.charAt(index+1)) {
				System.out.println(testData.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		String testData = "aabxac";
		FirstReccuringChar.getRecurringChar(testData);
	}

}
