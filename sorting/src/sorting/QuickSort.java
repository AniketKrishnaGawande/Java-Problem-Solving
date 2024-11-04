package sorting;

public class QuickSort {

	public static void sort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = partition(array, left, right);

		sort(array, left, pivot - 1);
		sort(array, pivot + 1, right);

	}

	private static int partition(int[] array, int left, int right) {

		int pivot = array[left];

		while (left != right) {
			while (array[right] > pivot && left != right) {
				right--;
			}

			if (left != right) {
				array[left] = array[right];
				left++;
			}

			while (array[left] < pivot && left != right) {
				left++;
			}
			if (left != right) {
				array[right] = array[left];
				right--;

			}
		}
		array[left] = pivot;
		return right;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 6, 2, 4, 9, 4, 1, 2, 4 };

		sort(arr, 0, 9);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
