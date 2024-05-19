import java.util.Scanner;

public class jp15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter '1' for Rupees to Dollar or enter '2' for Dollar to Rupees : ");
        int choice = scanner.nextInt();
		double rs,dr;

        switch (choice) {
            case 1:
				System.out.print("Enter amount in Rupees :");
                rs = scanner.nextDouble();
				dr = rs/84;
                System.out.println("In Dollar: " + dr);
                break;
            case 2:
				System.out.print("Enter amount in Dollar :");
                dr = scanner.nextDouble();
				rs = dr*84;
                System.out.println("Result: " + rs);
                break;
            default:
                System.out.println("Invalid operation choice.");
        }
    }
}
