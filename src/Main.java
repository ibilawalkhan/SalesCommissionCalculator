import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salesPersonEarning = 0.0;
        double totalEarning = 0.0;
        double itemSold = 0.0;

        System.out.println("Enter the item sold");

        while(itemSold != -1) {

            itemSold = input.nextDouble();

            salesPersonEarning += itemSold;
        }

        totalEarning = 200 + (0.09 * salesPersonEarning);

        System.out.println("The total earning of Sales person is: $" + totalEarning);
    }
}