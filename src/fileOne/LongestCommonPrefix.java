package fileOne;

import java.util.Arrays;

public class LongestCommonPrefix {


	public static void getLongestPrefix(String[] testData) {

		int testDataSize = testData.length;

		if(testDataSize==0){
			System.out.println("Please provide valid data set");
		} else if(testDataSize==1) {
			System.out.println("The longest common prefix is" +testData[0]);
		} else {

			/**The Array.sort function will check the car from the string array and sort it alphabetically
			 * */
			Arrays.sort(testData);
			
			/**The Math.min function will get the minimum length from the given two string after comparison
			 * 
			 * */
			int minDataLen = Math.min(testData[0].length(), testData[testDataSize-1].length());

			int i = 0;
			while (i < minDataLen && testData[0].charAt(i) == testData[testDataSize-1].charAt(i) )
				i++;
			
			/**The Substring function will get you the substring from the given string based on the given start and end index
			 * */

			String longestPrefix = testData[0].substring(0, i);
			System.out.println("The longest common prefix is " +longestPrefix);
		}

	}

	public static void main(String[] args) {
		String[] testData = {"String", "Strin", "Str"};
		LongestCommonPrefix.getLongestPrefix(testData);
	}

}

