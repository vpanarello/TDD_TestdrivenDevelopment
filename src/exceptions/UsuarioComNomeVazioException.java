/**
 * 
 */
package exceptions;

@SuppressWarnings("serial")
public class UsuarioComNomeVazioException extends Exception {
	public UsuarioComNomeVazioException(String message)
    {
       super(message);
    }
}