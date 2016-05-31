package src;

import java.util.ArrayList;
import java.util.List;

/**
 * S01.03_TDD-CamelCase / SplitStrings.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class SplitStrings {

	public static List<String> converterCamelCase(String original) throws Exception{

		List<String> _retList = new ArrayList<>();

		int[] _upperCaseIndexes = new int[original.length()];
		int arrayIndex = 0;
		boolean lowCaseOc = false;

		for (int i = 0; i < original.length(); i++){ 
			
			int c = (int) original.charAt(i);
			int nextC;
			int prevC;
			
			if(i > 0) prevC = (int) original.charAt(i-1);
			else prevC = c;
			if(i < original.length() - 1) nextC = (int) original.charAt(i+1);
			else nextC = c;
			
			
			if ((i == 0) && (c >= 48 && c <= 57)) {
				throw new Exception("Strings beginning with number are not permitted");
			}
			else if ((c >= 65 && c <= 90) || (c >= 48 && c <= 57) || (i == 0)){ // A-Z, 0-9
				
				_upperCaseIndexes[arrayIndex] = i;
				
				if (nextC >= 97 && nextC <= 122) arrayIndex++; 		// minusculas depois
				else if (prevC >= 97 && prevC <= 122) arrayIndex++; // minusculas antes
				else if (i == 0) arrayIndex++;
			}
			else if ( !(c >= 97 && c <= 122) ) {
				throw new Exception("String must not have any special characters");			
			}
		}
		
		int[] upperCaseIndexes = new int[arrayIndex];
		
		for(int i = 0; i < arrayIndex; i++){  				// resize array
			upperCaseIndexes[i] = _upperCaseIndexes[i];
		}
		_upperCaseIndexes = null; 							// free first temp array

		for(int i = 0; i < upperCaseIndexes.length; i++){

			int start = upperCaseIndexes[i];
			int end;

			if (i < upperCaseIndexes.length - 1) end = upperCaseIndexes[i + 1];
			else end = original.length();
			
			_retList.add(original.substring(start,end));
		}
		
		// put to lowCase when needed
		List<String> retList = new ArrayList<>(); 
		
		for (String word : _retList) {
			int upperCaseCharsNumber = 0;
			for(int i = 0; i < word.length(); i++) {
				int c = word.charAt(i);
				if (c >= 65 && c <= 90) upperCaseCharsNumber++; // count number of upperCase char in a word
			}
			if (upperCaseCharsNumber <= 1 ) retList.add(word.toLowerCase());
			else retList.add(word);
		}
		
		_retList = null;	// destroy temp list

		return retList;
	}
}	

