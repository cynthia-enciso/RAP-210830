package strings;

public class ExerciseAlternativeSolutions {
	public static void main(String[] args) {
		int count = vowelCount("supercalifragilisticexpialidocious");
		System.out.println(count);
	}
	
	// solution #1
	public static int vowelCount(String s) {
	int count = 0;

	String vowels = "aeiuo";
	
	// iterate over string
	for (int index = 0; index < s.length(); index++) {
		// compare with vowels
		char currentCharacter = s.charAt(index);
		
		if (vowels.contains(Character.toString(currentCharacter))) {
//			System.out.println(currentCharacter);
			count++;
		}
	}
	
	return count;
}

	// solution #2
//public static int vowelCount(String s) {
//	int count = 0;
//	
//	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//	// loop through our string
//	for (int index = 0; index < s.length(); index++) {
//		// compare with vowels
//		char currentCharacter = s.charAt(index);
//		
//		// loop through character array
//		for (int vowelIndex = 0; vowelIndex < vowels.length; vowelIndex++) {
			// compare current string element to every character in array
//			if (currentCharacter == vowels[vowelIndex]) {
//				count++;
//			}
//		}
//	}
//	
//	return count;
//}
}
