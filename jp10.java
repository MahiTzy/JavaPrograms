import java.util.Scanner;

public class jp10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in seconds: ");
        int seconds = scanner.nextInt();
		int hrs = seconds/3600;
		int rm = seconds%3600;
        int minutes = rm / 60;
        int remainingSeconds = rm % 60;

        System.out.println(hrs+" hrs "+ minutes + " min " + remainingSeconds + " s");
    }
}