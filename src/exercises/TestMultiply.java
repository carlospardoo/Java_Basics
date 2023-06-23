package exercises;


import java.util.stream.IntStream;

public class TestMultiply {

    public static void main(String[] args) {
        multiplyTable(2);
    }

    public static void multiplyTable(int multiple){

        IntStream.range(1, 11).forEach( x -> System.out.printf("%1$d x %2$d = %3$d%n", multiple, x, (multiple * x) ));
    }
}
