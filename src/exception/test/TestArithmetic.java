package exception.test;

import exception.exception_handler.OperationException;

import static exception.arithmetic.Arithmetic.divide;

public class TestArithmetic {

    public static void main(String[] args) {
        int result = 0;

        try {
            divide(10, 0);
        }
        //Primero los catch de menor jerarquia
        catch (OperationException e){
            System.out.println("Ocurrio un error de tipo OperationException");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("Division entre cero revisada");
        }

        System.out.println("result = " + result);
    }

}
