package banking_app;

/**
 * Extend unchecked exception (Error and RuntimeException)
 * Created by ovidiu on 02-Feb-17.
 */
public class OnlyOneCurrentAccountException extends RuntimeException {
    public OnlyOneCurrentAccountException(String message) {
        super(message);
    }
}
