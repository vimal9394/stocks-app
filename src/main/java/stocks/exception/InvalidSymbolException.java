package stocks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="The ticker symbol must only contain letters") //400

public class InvalidSymbolException extends RuntimeException{
	public InvalidSymbolException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
