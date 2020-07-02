package Exceptions;

public class WrongFoodException extends Exception {
    private String message;

    public WrongFoodException(String message) {
        super(message);
    }
}
