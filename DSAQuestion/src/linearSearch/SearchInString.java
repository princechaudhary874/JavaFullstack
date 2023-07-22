package linearSearch;

public class SearchInString {
	public static void main(String[] args) {
		String str = "Aayush Sapkota";
		char sp = 'a';
		try {
			if (searchChar(str, sp)) {
				System.out.println(sp + " is found in " + str);
			} else {
				System.out.println(sp + " is not found in " + str);
			}
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
	}

	static boolean searchChar(String str, char sp) {
		if (str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (sp == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
