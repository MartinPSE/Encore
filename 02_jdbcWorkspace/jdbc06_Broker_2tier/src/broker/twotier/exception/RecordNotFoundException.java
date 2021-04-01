package broker.twotier.exception;

public class RecordNotFoundException extends Exception{
	
	public RecordNotFoundException () {
		this("Sorry, We can't find that record");
		
	}
	public RecordNotFoundException(String s) {
		super(s);
	}

}
