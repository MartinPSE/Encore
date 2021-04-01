package encore.exception;



public class ISBNNotFoundException extends Exception{
	
	public ISBNNotFoundException() {
		this("ISBN can't find in our list");
		
	}
	
	public ISBNNotFoundException(String message) {
		super(message);
	}
	
	
	

}
