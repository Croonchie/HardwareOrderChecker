
import java.util.Scanner;

public class HardwareOrderChecker {
    public static void main(String[] args) {
        final int BOLT_PRICE = 6;
        final int NUT_PRICE = 4;
        final int WASHER_PRICE = 2;

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Number of bolts: ");
        int bolts = scanner.nextInt();

        System.out.print("Number of nuts: ");
        int nuts = scanner.nextInt();

        System.out.print("Number of washers: ");
        int washers = scanner.nextInt();

        // Calculate total cost
        int totalCost = bolts * BOLT_PRICE + nuts * NUT_PRICE + washers * WASHER_PRICE;

        // Check the order
        boolean orderOk = true;
        if (nuts < bolts) {
            System.out.println("Check the order: too few nuts.");
            orderOk = false;
        }
        if (washers < 2 * bolts) {
            System.out.println("Check the order: too few washers.");
            orderOk = false;
        }

        if (orderOk) {
            System.out.println("Order is OK.");
        }

        // Print total cost
        System.out.println("Total cost: " + totalCost);
    }
}
