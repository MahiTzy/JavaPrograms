import java.util.*;

public class jp12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age : ");
        int age = scanner.nextInt();
		if(age<18)
		{
			System.out.println("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
    }
}