package exercises;

import java.util.Scanner;

public class TestPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        String reverseString = "";
        for(int i = A.length() - 1; i >= 0 ; i--){
            Character current = A.charAt(i);
            reverseString += current;
        }

        String returned = (A.matches(reverseString)) ? "Yes" : "No" ;

        System.out.println(returned);

    }
}
