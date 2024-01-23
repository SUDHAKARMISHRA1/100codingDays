package fileOne;

import java.util.Arrays;

public class CheckAnargams {


	public static void checkAnargams(String firstValue, String secondValue) {
		String cleanDataOne = firstValue.replace("\\s","");
		String cleanDataTwo = secondValue.replace("\\s","");

		if(cleanDataOne.length()!=cleanDataTwo.length()) {
			System.out.println("Given String "+secondValue+" is not Anargams of string "+firstValue+"");
		} else {

			char[] dataOne = cleanDataOne.toLowerCase().toCharArray();
			char[] dataTwo = cleanDataTwo.toLowerCase().toCharArray();

			Arrays.sort(dataOne);
			Arrays.sort(dataTwo);

			if(Arrays.equals(dataOne,dataTwo)) {
				System.out.println("Given String "+secondValue+" is an Anargams of string "+firstValue+"");
			} else {
				System.out.println("Given String "+secondValue+" is not Anargams of string "+firstValue+"");
			}	
		}
	}
	public static void main(String[] args) {
		String firstValue = "Silent";
		String secondValue = "Listen";
		CheckAnargams.checkAnargams(firstValue, secondValue);
	}

}
