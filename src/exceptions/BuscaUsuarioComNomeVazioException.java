/**
 * 
 */
package exceptions;

/**
 * S02.03_TDD-RefatoracaoSAB / BuscaUsuarioComNomeVazioException.java
 * FIAP / RM30222 - Vagner Panarello
 */
@SuppressWarnings("serial")
public class BuscaUsuarioComNomeVazioException extends Exception {
	public BuscaUsuarioComNomeVazioException(String message)
    {
       super(message);
    }
}
