package Exceptions;

/**
 * Исключение выбрасывается в случае, если попробовать накормить животное не верным типом еды.
 * Из перечисления Food.
 */
public class WrongFoodException extends Exception {
    private String message;

    public WrongFoodException(String message) {
        super(message);
    }
}
