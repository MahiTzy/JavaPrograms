import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = 0;

        if (unitsConsumed <= 100) {
            // First 100 units are free
            billAmount = 0;
        } else if (unitsConsumed <= 150) {
            // Next 50 units at ₹ 5 per unit
            billAmount = 5 * (unitsConsumed - 100);
        } else if (unitsConsumed <= 220) {
            // Next 70 units at ₹ 6 per unit
            billAmount = 5 * 50 + 6 * (unitsConsumed - 150);
        } else {
            // Above 220 units at ₹ 10 per unit
            billAmount = 5 * 50 + 6 * 70 + 10 * (unitsConsumed - 220);
        }

        System.out.println("Electricity Bill: ₹ " + billAmount);
    }
}
