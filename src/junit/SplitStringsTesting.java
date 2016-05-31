/**
 * 
 */
package junit;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import src.SplitStrings;

/**
 * S01.03_TDD-CamelCase / SplitStringsTesting.java
 * FIAP / RM30222 - Vagner Panarello
 */
public class SplitStringsTesting {
	
	@Test
	public void t_output_itensCount() throws Exception {
		List<String> words = SplitStrings.converterCamelCase("nomeCompostoParaTestes");
		
		assertEquals(4, words.size(), 0);
	}
	
	@Test
	public void t_Input_nomeComposto() throws Exception {
		List<String> words = SplitStrings.converterCamelCase("nomeComposto");
		
		String[] checkWords = {"nome","composto"};
		for(int i = 0;  i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
	}
	
	@Test
	public void t_Input_NomeComposto() throws Exception{
		
		List<String> words = SplitStrings.converterCamelCase("NomeComposto");	
		String[] checkWords = {"nome","composto"};
		
		for(int i = 0;  i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
		
	}
	@Test
	public void t_Input_nome() throws Exception{
		List<String> words = SplitStrings.converterCamelCase("nome");
		assertTrue("OUT: " + words.get(0), words.get(0).equals("nome"));
		
	}
	@Test
	public void t_Input_Nome() throws Exception{
		List<String> words = SplitStrings.converterCamelCase("Nome");
		assertTrue("OUT: " + words.get(0), words.get(0).equals("nome"));
		
	}
	
	@Test
	public void t_Input_CPF() throws Exception{
		List<String> words = SplitStrings.converterCamelCase("CPF");
		assertTrue("OUT: " + words.get(0), words.get(0).equals("CPF"));
		
	}
	@Test
	public void t_Input_numeroCPF() throws Exception{
		
		List<String> words = SplitStrings.converterCamelCase("numeroCPF");	
		String[] checkWords = {"numero","CPF"};
		
		for(int i = 0; i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
	}
	
	@Test
	public void t_Input_numeroCPFContribuinte() throws Exception{
		
		List<String> words = SplitStrings.converterCamelCase("numeroCPFContribuinte");	
		String[] checkWords = {"numero","CPF","contribuinte"};
		
		for(int i = 0; i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
	}
	
	@Test
	public void t_Input_recupera10Primeiros() throws Exception{
		
		List<String> words = SplitStrings.converterCamelCase("recupera10Primeiros");	
		String[] checkWords = {"recupera","10","primeiros"};
		
		for(int i = 0; i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
	}
	
	@Test(expected = Exception.class)
	public void t_Input_10Primeiros() throws Exception{
		
		List<String> words = SplitStrings.converterCamelCase("10Primeiros");	
		String[] checkWords = {"10","primeiros"};
		
		for(int i = 0; i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
	}
	
	@Test(expected = Exception.class)
	public void t_Input_SpecialChar() throws Exception{
		
		List<String> words = SplitStrings.converterCamelCase("nome#Composto");	
		String[] checkWords = {"10","primeiros"};
		
		for(int i = 0; i < checkWords.length; i++){
			assertTrue("OUT: " + words.get(i), words.get(i).equals(checkWords[i]));
		}
	}
	
	
	
	
}
