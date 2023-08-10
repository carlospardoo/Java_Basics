package exercises;

import java.util.Scanner;

public class TestValidateUsername {

    public static final String REGULAR_EXPRESSION = "^[A-Za-z][_a-zA-Z0-9]{7,29}$";
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(REGULAR_EXPRESSION)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

