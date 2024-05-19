import java.util.*;

public class jp14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Choose operator(+,-,/,*,%) : ");
		char ch = scanner.next().charAt(0);
		System.out.println("Enter 1st number : ");
        int num1 = scanner.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = scanner.nextInt();
		int c;
		if(ch=='+')
		{
			c=num1+num2;
			System.out.println("Sum is : "+c);
		}
		else if(ch=='-')
		{
			c=num1-num2;
			System.out.println("Sub is : "+c);
		}
		else if(ch=='*')
		{
			c=num1*num2;
			System.out.println("Mul is : "+c);
		}
		else if(ch=='/')
		{
			c=num1/num2;
			System.out.println("Div is : "+c);
		}
		else if(ch=='%')
		{
			c=num1%num2;
			System.out.println("Modulo is : "+c);
		}
		else
		{
			System.out.println("Invalid Input");
		}
    }
}