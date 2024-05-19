import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the choice (CTF or FTC): ");
        char choice = scanner.next().charAt(0);

        double temperature, convertedTemperature;

        if (choice == 'C' || choice == 'c') {
            System.out.print("Enter the temperature in Celsius: ");
            temperature = scanner.nextDouble();

            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else if (choice == 'F' || choice == 'f') {
            System.out.print("Enter the temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();

            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else {
            System.out.println("Invalid choice. Please enter CTF or FTC.");
        }
    }
}
