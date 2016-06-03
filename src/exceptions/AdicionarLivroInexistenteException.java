/**
 * 
 */
package exceptions;


@SuppressWarnings("serial")
public class AdicionarLivroInexistenteException extends Exception {
	
	
	public AdicionarLivroInexistenteException() {}

    public AdicionarLivroInexistenteException(String message)
    {
       super(message);
    }
}