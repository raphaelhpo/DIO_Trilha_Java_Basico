package br.com.fastcommerce.fastcommerce.exceptions;

public class ClienteExistsException extends RuntimeException {
    public ClienteExistsException() {
        super("Cliente já cadastrado.");
    }

    public ClienteExistsException(String message) {
        super(message);
    }
}
