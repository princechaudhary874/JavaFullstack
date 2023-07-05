package stringQuestion;

public class CapitalizedWords {
	public static void main(String[] args) {
		// Input string
		String str = "i am learning";
		
		// Split the string into an array of words
		String str2[] = str.split(" ");
		
		// String to store the capitalized words
		String capitalized = "";

		// Iterate over each word in the array
		for (String w : str2) {
			// Extract the first character of the word
			String first = w.substring(0, 1);
			
			// Extract the remaining characters of the word
			String remaining = w.substring(1);
			
			// Capitalize the first character and concatenate with the remaining characters
			capitalized += first.toUpperCase() + remaining + " ";
		}
		
		// Trim the extra whitespace and print the capitalized words
		System.out.print(capitalized.trim());
	}
}
