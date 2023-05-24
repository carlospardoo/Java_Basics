package exception.exception_handler;

//Exceptions of type uncheck
public class OperationRuntimeException extends RuntimeException {

    public OperationRuntimeException(String message) {
        super(message);
    }
}
