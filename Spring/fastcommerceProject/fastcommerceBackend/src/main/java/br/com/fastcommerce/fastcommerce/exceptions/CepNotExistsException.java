package br.com.fastcommerce.fastcommerce.exceptions;

public class CepNotExistsException extends RuntimeException{
    public CepNotExistsException() {
        super("CEP não encontrado.");
    }
    
    public CepNotExistsException(String message) {
        super(message);
    }
}
