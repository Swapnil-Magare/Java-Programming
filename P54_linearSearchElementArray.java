package JavaProgramming;
//WAP to find the element by linear Search Element Array.

public class P54_linearSearchElementArray {

	public static void main(String[] args) {
		int []arr= {2,4,1,3,5,63,3};
		int index = -1;
		int search = 5;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] ==search) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("Present : "+ index);
		} else {
			System.out.println("Not Present");
		}
	}

}
