package src;

import java.util.ArrayList;
import java.util.List;

/**
 * S01.03_TDD-CamelCase / SplitStrings.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class SplitStrings {
	
	public static List<String> converterCamelCase(String original) throws Exception{
		
		List<String> words = new ArrayList<>();
		SplitStrings.stringValidating(original);
		for (String word : SplitStrings.splitString(original).split(",")) {
			words.add(word);
		}
		return SplitStrings.charCasesNormalizer(words);
	}
	
	private static void stringValidating(String camelCaseString) throws Exception{
		
		for (int i = 0; i < camelCaseString.length(); i++){ 				
			int c = (int) camelCaseString.charAt(i);
			
			if ((i == 0) && (c >= 48 && c <= 57))
				throw new Exception("Strings beginning with number are not permitted");
			else if ( !(c >= 97 && c <= 122) && !(c >= 65 && c <= 90) && !(c >= 48 && c <= 57))
				throw new Exception("String must not have any special characters");
		}
	}
	
	private static String splitString(String camelCaseString){
		
		String regex =     "(?<=[A-Z])(?=[A-Z][a-z])|"
					     + "(?<=[^A-Z])(?=[A-Z])|"
						 + "(?<=[A-Za-z])(?=[^A-Za-z])"; 
		
		return camelCaseString.replaceAll(regex, ",");	
	}
		
	private static List<String> charCasesNormalizer(List<String> wordsList){

		List<String> retList = new ArrayList<>(); 
		for (String word : wordsList) {
			int upperCaseCharsNumber = 0;
			for(int i = 0; i < word.length(); i++) {
				int c = word.charAt(i);
				if (c >= 65 && c <= 90) upperCaseCharsNumber++; // count number of upperCase char in a word
			}
			if (upperCaseCharsNumber <= 1 ) retList.add(word.toLowerCase());
			else retList.add(word);}
		return retList;
	}
	
	
	
	
	
}	

