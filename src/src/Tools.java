/**
 * 
 */
package src;

/**
 * S01.03_TDD-CamelCase / tools.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Tools {
	
	public static void printArray(int[] uArray){
		for(int i = 0; i < uArray.length; i++){
			System.out.printf("%d - ", uArray[i]);
		}
		System.out.printf("%n");
	}

	public static void sort(int[] uArray){	
		boolean notSorted;
		do {
			notSorted  = false;
			for (int i = 0; i < uArray.length; i++) {

				if (i > (uArray.length - 2)) break;
				if (uArray[i] < uArray[i + 1]) {
					int temp = uArray[i + 1];
					uArray[i + 1] = uArray[i];
					uArray[i] = temp;
					notSorted = true;
				}
			}
		} while (notSorted);		
	}
	

}
