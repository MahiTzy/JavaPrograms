import java.util.Scanner;

public class jp9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time in seconds: ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(minutes + " min " + remainingSeconds + " s");
    }
}
