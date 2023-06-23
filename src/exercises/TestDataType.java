package exercises;

import java.util.Scanner;

public class TestDataType {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] currents = new String[n];
        String text = "";


        for (int i = 0; i < n; i++) {
            currents[i] = sc.nextLine();
        }

        for(String current : currents){
            try{
                text = current + " can be fitted in:\n";

                long currentValue = Long.parseLong(current);
                if(currentValue >= Byte.MIN_VALUE && currentValue <= Byte.MAX_VALUE){
                    text += "* byte\n";
                }
                if(currentValue >= Short.MIN_VALUE && currentValue <= Short.MAX_VALUE){
                    text += "* short\n";
                }
                if(currentValue >= Integer.MIN_VALUE && currentValue <= Integer.MAX_VALUE){
                    text += "* int\n";
                }
                if(currentValue >= Long.MIN_VALUE && currentValue <= Long.MAX_VALUE){
                    text += "* long\n";
                }
                else{
                    text = current + " can't be fitted anywhere.\n";
                }

                System.out.print(text);

            }
            catch (NumberFormatException e){
                text = current + " can't be fitted anywhere.\n";
                System.out.print(text);
            }
        }

    }
}
