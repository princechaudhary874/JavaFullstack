// The 'linearSearch' package containing the class 'SearchInRange'
package linearSearch;

// Class 'SearchInRange'
public class SearchInRange {
	// Main method, the entry point of the program
	public static void main(String[] args) {
		// Array of integers to search in
		int[] arr = { 1, 2424, 6546, 76, 33, 3234, 566, 75, 23, 43, 23, 12 };
		// The target integer to search for
		int target = 76;

		try {
			// Perform the search within the specified range (start to end)
			if (check(arr, target, 2, 9)) {
				System.out.println(target + " is found in range");
			} else {
				System.out.println(target + " is not found in range");
			}
		} catch (Exception e) {
			// Catch any unexpected exception that might occur during execution
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
	}

	// Function to check if the target integer exists within the specified range in
	// the array
	static boolean check(int[] arr, int target, int start, int end) {
		// Loop through the elements within the specified range (start to end)
		for (int i = start; i <= end; i++) {
			// If the target element is found in the array, return true
			if (target == arr[i]) {
				return true;
			}
		}
		// If the target element is not found in the range, return false
		return false;
	}
}
