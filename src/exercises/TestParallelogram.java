package exercises;

import java.util.Scanner;

public class TestParallelogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int breadth = sc.nextInt();
        int height = sc.nextInt();

        if(breadth <= 0 || height <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println( (breadth * height) );
        }

    }
}
