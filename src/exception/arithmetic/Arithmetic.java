package exception.arithmetic;

import exception.exception_handler.OperationException;
import exception.exception_handler.OperationRuntimeException;

public class Arithmetic {

    public static int divide(int numerator, int denominator) throws OperationException{
        if(denominator == 0)
            throw new OperationException("Division entre cero");
        return numerator / denominator;
    }

    //Como es runtime exception, no requiere que lance throw
    public static int divideRuntime(int numerator, int denominator){
        if(denominator == 0)
            throw new OperationRuntimeException("Division entre cero");
        return numerator / denominator;
    }

}
