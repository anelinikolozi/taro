package ge.tanini.taro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class TaroRuntimeException extends RuntimeException {
    public TaroRuntimeException(){super();}
    public TaroRuntimeException(String message){super(message);}
    public TaroRuntimeException(String message,Throwable cause){super(message, cause);}
    public TaroRuntimeException(Throwable throwable){super(throwable);}
}
