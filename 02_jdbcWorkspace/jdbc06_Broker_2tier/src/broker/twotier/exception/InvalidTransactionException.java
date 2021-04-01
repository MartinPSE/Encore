package broker.twotier.exception;

public class InvalidTransactionException extends Exception {
	
	public InvalidTransactionException () {
		this("Sorry, That valid is unsuitable");
		
		}
		
	public InvalidTransactionException(String s) {
		super(s);
		
	}

}
