package broker.twotier.exception;

public class DuplicateSSNException extends Exception{
	
	public DuplicateSSNException () {
		this("Sorry, That SSN is duplicated.");
		
		}
		
	public DuplicateSSNException(String s) {
		super(s);
		
	}

		
	
	
	
	

}
