package sorting;

public class MergedSort {

	public static void sort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (right + left) / 2;
		sort(arr, left, mid);
		sort(arr, mid + 1, right);
		merge(arr, left, mid, mid + 1, right);
	}

	
	public static void merge(int[] arr, int leftStart, int leftEnd, int rightStart, int rightEnd) {
		int size = rightEnd - leftStart + 1;

		int[] newArr = new int[size];
		int newIndex = -1;

		while (leftStart <= leftEnd && rightStart <= rightEnd) {
			if (arr[leftStart] < arr[rightStart]) {
				newArr[++newIndex] = arr[leftStart]; 
				    leftStart++;  
			} else {
				newArr[++newIndex] = arr[rightStart];  
//				// insert right array element into merged array 
			    rightStart++; // go to next element of right array 
			}

		}

		while (leftStart <= leftEnd) {
			newArr[++newIndex] = arr[leftStart]; 
			   leftStart++; // go to next left array element 
		}

		while (rightStart <= rightEnd) {
			newArr[++newIndex] = arr[rightStart++]; 
		}

		for(int i=0;i<size;i++) {
			arr[rightEnd]=newArr[newIndex];
			newIndex--;
			rightEnd--;
					
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 6, 2, 4,0, 1,0,12,34,-1};

		sort(arr, 0, 10);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
