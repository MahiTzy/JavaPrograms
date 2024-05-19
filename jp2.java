import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println(number + " is divisible by both 5 and 7.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5 but not by 7.");
        } else if (number % 7 == 0) {
            System.out.println(number + " is divisible by 7 but not by 5.");
        } else {
            System.out.println(number + " is neither divisible by 5 nor by 7.");
        }
    }
}
