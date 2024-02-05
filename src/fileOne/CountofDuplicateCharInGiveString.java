package fileOne;

import java.util.HashMap;
import java.util.Map;

public class CountofDuplicateCharInGiveString {


	public static void getCount(String testData) {
		int dataLen = testData.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<dataLen;i++) {
			if(map.containsKey(testData.charAt(i))) {
				map.put(testData.charAt(i), map.get(testData.charAt(i))+1);
			} else {
				map.put(testData.charAt(i), 1);
			}
		}

		for(Map.Entry<Character, Integer> set : map.entrySet()) {
			if(set.getValue()>1) {
				System.out.println(set.getKey() + "=" +set.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String testData = "geeksofgeeks";
		CountofDuplicateCharInGiveString.getCount(testData);
	}
}
