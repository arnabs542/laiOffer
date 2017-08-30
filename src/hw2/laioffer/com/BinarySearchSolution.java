package hw2.laioffer.com;

public class BinarySearchSolution {
	public int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}
}
