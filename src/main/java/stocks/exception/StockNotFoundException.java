package stocks.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such stock exists")  // 404
public class StockNotFoundException extends RuntimeException{
    public StockNotFoundException(String id) {
        super(id);
    }
}
