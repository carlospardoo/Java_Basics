package exercises;

public class TestDrawingBook {

    public static void main(String[] args) {
        int n = 6;
        int p = 5;
        System.out.println(pageCount(n, p));
    }

    public static int pageCount(int n, int p) {

        n = (n % 2 == 0) ? n + 1 : n;

        int startAtBeginning = p / 2;
        int startAtEnd = (n - p) / 2;

        return Math.min(startAtBeginning, startAtEnd);

    }

}
