package aufgabe20_Strings;

public class Mixer {
	
	/**
	 * Change first character with last character of word and vice versa
	 * @param word
	 * @return changed word
	 */
	public static String changeFirstWithLastCharacter(String word)  {
		int lastIndex = word.length()-1;
		
		char start = word.charAt(0);
		char end = word.charAt(lastIndex);
		String middleString = word.substring(1, lastIndex);
		
		return end + middleString + start ;
	}
	
	/**
	 * Divide word in in 2 equal parts and change order of the parts
	 * @param word
	 * @return changed word
	 */
	public static String divideWord(String word) {
		int halfIndex = word.length() / 2;
//		System.out.printf("len=%d half=%d%n", word.length(), halfIndex);
		
		String firstHalfString = word.substring(0, halfIndex);
		String secondHalfString = word.substring(halfIndex);
		
//		System.out.println(firstHalfString);
//		System.out.println(secondHalfString);
		
		return secondHalfString + firstHalfString;
	}
	
	/**
	 * Convert last 3 characters of word into uppercase 
	 * @param word
	 * @return changed word
	 */
	public static String convertLast3CharsToUppercase(String word) {
		int wordDivider = word.length() - 3;
		
		String secondPartString = word.substring(wordDivider);
		String firstPartString = word.substring(0, wordDivider);
		
		return firstPartString + secondPartString.toUpperCase();
	}

}
