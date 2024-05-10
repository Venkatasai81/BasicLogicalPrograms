package ArrayProgrammes;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicates {

	static int removeDuplicates(int[] arr, int n) {
		if (n <= 1)
			return n;
		Set<Integer> uniqueElements = new HashSet<>();

		for (int i = 0; i < n; ++i) {
			uniqueElements.add(arr[i]);
		}

		int index = 0;
		// Iterate through unique elements and update the original array
		for (int element : uniqueElements) {
			arr[index++] = element;
		}

		// Return the count of unique elements
		return uniqueElements.size();
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int n = arr.length;

		// Remove duplicates and get the count of unique elements
		n = removeDuplicates(arr, n);

		// Print the modified array containing unique elements
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
