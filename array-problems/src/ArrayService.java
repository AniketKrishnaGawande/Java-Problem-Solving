import java.util.HashMap;
import java.util.Map;

public class ArrayService {

	public static int[] maxSumSubArray(int[] array, int subArrayLength) {

		int startIndex;
		int maxSum = Integer.MIN_VALUE;
		int windowSum = 0;

		for (int i = 0; i < subArrayLength; i++) {
			windowSum += array[i];
		}

		maxSum = windowSum;
		startIndex = 0;

		for (int i = subArrayLength; i < array.length; i++) {
			windowSum = windowSum + array[i] - array[i - subArrayLength];
			if (windowSum > maxSum) {
				maxSum = windowSum;
				startIndex = i - subArrayLength + 1;
			}
		}

		int[] subArray = new int[subArrayLength];
		for (int i = startIndex, j = 0; j < subArrayLength; i++, j++) {
			subArray[j] = array[i];

		}
		return subArray;
	}

	public static int[] maxLengthSubArrayforSum(int[] array, int targetSum) {
		int maxLength = 0;
		int start = -1;
		int end = -1;
		int left = 0;
		int windowSum = 0;

		for (int right = 0; right < array.length; right++) {
			windowSum = windowSum + array[right];
			while (windowSum > targetSum && left <= right) {
				if (array[left] >= 0)
					windowSum -= array[left];
				else
					windowSum += array[left];
				left++;
			}
			if (windowSum == targetSum && maxLength < (right - left + 1)) {
				maxLength = (right - left + 1);
				start = left;
				end = right;
			}

		}

		int[] arr = new int[maxLength];
		for (int i = start, j = 0; i >= 0 && i <= end; i++, j++) {
			arr[j] = array[i];
		}

		return arr;
	}

	static int flipZero(int[] array, int maxFlips) {
		int flips=0;
		int left=0;
		int maxLength=0;
		for(int r=0;r<array.length;r++) {
			if(array[r]==0) {
				flips++;
			}
			while(flips>2 && left<=r) {
				if(array[left]==0)
				flips--;
				left++;
			}
			if(flips==maxFlips && maxLength<(r-left+1)) {
				maxLength=(r-left+1);
			}
		}
		return maxLength;
		
	}
	
	static int sequenceNo(String str, String seq) {
	int minLength=Integer.MAX_VALUE;
	Map<Character, Integer> trackingMap = new HashMap<Character, Integer>();
	
	for(char ch : seq.toCharArray()) {
		trackingMap.put(ch, 0);
	}
	int left=0;
	
	char [] arr = str.toCharArray();
	
	for(int r=0;r<str.length();r++) {
	
		if(trackingMap.containsKey(arr[r])) {
			trackingMap.put(arr[r],1);
		}
		
		while(trackingMap.) {
			
		}
		
		
		
	}
		
		
		
	}
	
	public static void main(String[] args) {
		int arr = flipZero(new int[] {0,1,0,1,0,0,1,1}, 2);
		System.out.println(arr);
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}

	}

}
