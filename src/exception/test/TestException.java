package exception.test;

public class TestException {
    public static void main(String[] args) {

        int result = 0;

        try {
            //ArithmeticException
            result = 10/0;

        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("result = " + result);

    }
}
