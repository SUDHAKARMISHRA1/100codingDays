package fileOne;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringChar {

	public static void getFirstRecurringChar(String data) {
		int len = data.length();
		Set<Character> setChar = new HashSet<Character>();
		for(int index=0;index<len;index++) {
			if(setChar.add(data.charAt(index))==false) {
				System.out.println("The index of recurring char is:" +index);
			}
		}
	}
	public static void main(String[] args) {
		String data = "Sudhakar";
		FirstRecurringChar.getFirstRecurringChar(data);
	}
}
