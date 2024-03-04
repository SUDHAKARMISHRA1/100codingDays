package fileOne;

public class MinimumOperationToTransform {


	public static void getMinimumOpsCount(String one, String two) {

		int lenOne = one.length();
		int lenTwo = two.length();
		
		if(lenOne != lenTwo) {
			System.out.println("Transformation is not possible becuase of string length");
		}
		
		String three = "";
		int count = 0;
		
		for(int i=0;i<lenOne && i<lenTwo;i++) {
			Character test = one.charAt(i);
			String dd = test.toString();
			
			
		}
		System.out.println(three);
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {

		String one = "bad";
		String two = "bda";
		MinimumOperationToTransform.getMinimumOpsCount(one, two);
	}
}
