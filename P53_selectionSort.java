package JavaProgramming;

//WAP to arrange the Element in Ascending Order by using. Selection sort
public class P53_selectionSort {
	public static void  printArray(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		int []arr = {33,22,11,3,2,4,2,55,3,6};
		System.out.println("Before Sorting.");
		printArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex =j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex]=temp;
		}
		System.out.println("After Sorting.");
		printArray(arr);
		
	}

}
