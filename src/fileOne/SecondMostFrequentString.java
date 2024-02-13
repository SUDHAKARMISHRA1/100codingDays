package fileOne;

import java.util.*;
import java.util.Map;
import java.util.stream.*;

public class SecondMostFrequentString {


	public static void getMostFrequentString(String[] testData) {
		int dataLen = testData.length;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<dataLen;i++) {
			if(map.containsKey(testData[i])) {
				map.put(testData[i], map.get(testData[i])+1);
			} else {
				map.put(testData[i], 1);
			}

		}

		Map<String, Integer> hm1 = sortByValue(map);	
		int mapSize = hm1.size();
		int i=0;
		// print the sorted hashmap
		for (Map.Entry<String, Integer> en :
			hm1.entrySet()) {
			if(i==mapSize-2) {
				System.out.println("Key = " + en.getKey()
				+ ", Value = "
				+ en.getValue());	
			}else {

			}
			i++;
		}

	}

	// function to sort hashmap by values
	public static HashMap<String, Integer>
	sortByValue(HashMap<String, Integer> hm)
	{
		HashMap<String, Integer> temp
		= hm.entrySet()
		.stream()
		.sorted((i1, i2)
				-> i1.getValue().compareTo(
						i2.getValue()))
		.collect(Collectors.toMap(
				Map.Entry::getKey,
				Map.Entry::getValue,
				(e1, e2) -> e1, LinkedHashMap::new));

		return temp;
	}

	public static void main(String[] args) {
		String[] testData = {"geek", "for", "geek", "for", "geek", "aaa"};
		SecondMostFrequentString.getMostFrequentString(testData);
	}

}




