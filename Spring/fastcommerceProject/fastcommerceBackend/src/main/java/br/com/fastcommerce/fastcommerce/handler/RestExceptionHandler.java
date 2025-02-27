package br.com.fastcommerce.fastcommerce.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.fastcommerce.fastcommerce.exceptions.CepNotExistsException;
import br.com.fastcommerce.fastcommerce.exceptions.ClienteNotExistsException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ClienteNotExistsException.class)
    public ResponseEntity<RestErrorMessage> cepNotExistsExceptionHendler(ClienteNotExistsException exception) {
        RestErrorMessage error = new RestErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    @ExceptionHandler(CepNotExistsException.class)
    public ResponseEntity<RestErrorMessage> cepNotExistsExceptionHandler(CepNotExistsException exception) {
        RestErrorMessage error = new RestErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
