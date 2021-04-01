package encore.exception;


public class QuantityException extends Exception{
	
	public QuantityException() {
		this("Our quantity is short");
		
	}
	
	public QuantityException(String message) {
		super(message);
	}
	

}
