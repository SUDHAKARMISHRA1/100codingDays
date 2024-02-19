package fileOne;

public class HaystackNeedleProblem {

	public static void checkHaystackNeedle(String[] data) {
		String dataone = data[0];
		String datatwo = data[1];
		if(dataone.contains(datatwo)) {
			int index =dataone.indexOf(datatwo);
			System.out.println(index);
		} else {
			System.out.println("The needle is not there in Haystack.");
		}
	}	
	public static void main(String[] args) {
		String[] data = {"subssdet", "det"};
		HaystackNeedleProblem.checkHaystackNeedle(data);
	}	
}
