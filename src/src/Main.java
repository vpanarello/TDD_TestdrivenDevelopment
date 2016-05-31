/**
 * 
 */
package src;

import java.util.Arrays;
import java.util.List;

/**
 * S01.03_TDD-CamelCase / Main.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class Main {
	
	static List<String> list;

	public static void main(String[] args) {


		"".toCharArray()
		
		try {
			list = SplitStrings.converterCamelCase("testandoCPFSringsInput");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");

		for (String string : list) {
			System.out.print(string + " ");
		}
		
		
		
		
		
		
		
	

	}

}
