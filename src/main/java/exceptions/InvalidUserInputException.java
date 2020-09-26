package exceptions;

/**
 * This exception define a case when user input is invalid
 */
public class InvalidUserInputException extends Exception {
    public InvalidUserInputException(String msg) {
        super(msg);
    }
}
