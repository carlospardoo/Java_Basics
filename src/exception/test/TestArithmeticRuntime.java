package exception.test;

import static exception.arithmetic.Arithmetic.divideRuntime;

public class TestArithmeticRuntime {

    public static void main(String[] args) {
        int result = 0;

        divideRuntime(10, 0);

        System.out.println("result = " + result);
    }

}
