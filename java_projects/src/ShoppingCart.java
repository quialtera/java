package src;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item you would like to buy? ");
        item = scanner.nextLine();
        System.out.print("What is the price of this item? ");
        price = scanner.nextDouble();
        System.out.print("Which quantity do you want? ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("You have been ordered " + quantity + " " + item + " units. " +
                "\nYour purchase total was " + currency + total);
    }
}
