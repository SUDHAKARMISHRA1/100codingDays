package fileOne;

import java.util.Arrays;

public class ReverseArrayOfString {

	public static void getReverse(String[] testData) {
		int dataLen = testData.length;
		String[] revString = new String[dataLen];
		int count=0;
		for(int i=dataLen-1;i>=0;i--) {		
			revString[count]=testData[i];
			count++;
		}
		System.out.println(Arrays.toString(revString));
	}
	public static void main(String[] args) {
		String[] testData = {"A","e","i","o","u"};
		ReverseArrayOfString.getReverse(testData);
	}

}

