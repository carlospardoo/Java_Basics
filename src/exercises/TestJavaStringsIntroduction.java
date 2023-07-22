package exercises;

import java.util.Scanner;

public class TestJavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();

        int lengthSum = firstWord.length() + secondWord.length();
        String alphabetical;
        String together;

        if(firstWord.compareToIgnoreCase(secondWord) > 0){
            alphabetical = "Yes";
        }
        else{
            alphabetical = "No";
        }

        together = convertToFirstCase(firstWord) + " " + convertToFirstCase(secondWord);

        System.out.println(lengthSum);
        System.out.println(alphabetical);
        System.out.println(together);

    }

    public static String convertToFirstCase(String word){
        char firstLetter = word.toUpperCase().charAt(0);
        String newWord = String.join("", Character.toString(firstLetter), word.substring(1));
        return  newWord;
    }
}
