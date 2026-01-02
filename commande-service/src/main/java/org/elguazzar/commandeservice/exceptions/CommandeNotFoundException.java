package org.elguazzar.commandeservice.exceptions;

public class CommandeNotFoundException extends RuntimeException{
    public CommandeNotFoundException(String message) {
        super(message);
    }
}
