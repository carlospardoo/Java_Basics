package exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TestLoops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nQueries = sc.nextInt();

        sc.nextLine();

        int[][] parameters = new int[nQueries][3];

        for(int i = 0; i < nQueries; i++){
            String parametersLine = sc.nextLine();

            parameters[i] = Arrays.stream(parametersLine.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        printSeries(parameters);
    }

    public static void printSeries(int[][] params){
        
        for(int[] query : params){
            int result = 0;

            for(int i = 1; i <= query[2]; i++){
                result = query[0] + (query[1] * IntStream.range(0, i)
                        .map(x -> (int)Math.pow(2, x) )
                        .sum()
                );
                System.out.print(result + " ");
            }
            System.out.println();
        }
        
    }
}
