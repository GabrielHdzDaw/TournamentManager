package tournament.exceptions;

/**
 * Represents a custom exception for the tournament application.
 */
public class CustomException extends Exception{
    /**
     * Constructs a CustomException with the specified error message.
     *
     * @param message the error message
     */
    public CustomException(String message){
        super(message);
    }
}