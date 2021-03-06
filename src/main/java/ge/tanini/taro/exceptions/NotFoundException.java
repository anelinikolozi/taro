package ge.tanini.taro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.function.Supplier;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends TaroRuntimeException {
    public NotFoundException(){super();}
    public NotFoundException(String message){super(message);}


}
