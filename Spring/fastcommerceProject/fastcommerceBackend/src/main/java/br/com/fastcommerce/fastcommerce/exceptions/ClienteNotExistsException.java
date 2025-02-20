package br.com.fastcommerce.fastcommerce.exceptions;

public class ClienteNotExistsException extends RuntimeException{
    
    public ClienteNotExistsException() {
        super("Cliente não encontrado.");
    }

    public ClienteNotExistsException(String message) {
        super(message);
    }
}
