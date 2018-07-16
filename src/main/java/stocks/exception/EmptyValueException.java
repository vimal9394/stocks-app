package stocks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Each value must contain at least one character") //400

public class EmptyValueException extends RuntimeException{
	public EmptyValueException() {
		super();
		// TODO Auto-generated constructor stub
	}
}
