package fileOne;

import java.util.HashMap;

public class IsomorphicString {


	public boolean getIsomorphic(String firstData, String secondData) {
		
		if(firstData.length()!=secondData.length()){
			return false;
		}
		
		HashMap<Character,Character> map1=new HashMap<>();
		HashMap<Character,Boolean> map2=new HashMap<>();
		for(int i=0;i<firstData.length();i++){
			
			char ch1=firstData.charAt(i);
			char ch2=secondData.charAt(i);
			
			if(map1.containsKey(ch1)==true){
				if(map1.get(ch1)!=ch2){
					return false;
				}
			}else{
				if(map2.containsKey(ch2) == true){
					return false;
				}else{
					map1.put(ch1,ch2);
					map2.put(ch2,true);
				}
			}
		}
		return true;
		
	}	
	public static void main(String[] args) {
		String firstData = "ram";
		String secondData = "bai";
		SudhakarPalyground s = new SudhakarPalyground();
		boolean  result=  s.isIsomorphic(firstData, secondData);
		System.out.println(result);
	}
}
