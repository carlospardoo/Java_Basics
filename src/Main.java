import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre:");
        String name = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int key = scanner.nextInt();
        System.out.println("Proporciona el precio:");
        double price = scanner.nextDouble();
        System.out.println("Proporciona el envio gratuito:");
        boolean isFreeDelivery = scanner.nextBoolean();

        System.out.println(name + " #" + key);
        System.out.println("Precio: $" + price);
        System.out.println("Envio Gratuito: " + isFreeDelivery);

        var decimal = 4.5;

        System.out.println("decimal = " + decimal);

    }
}