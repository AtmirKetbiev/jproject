package ru.ketbiev.spring.jproject.exceptionHandling;

public class NoSuchException extends RuntimeException {
    public NoSuchException(String message) {
        super("No " + message + " in database");
    }
}
