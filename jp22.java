//WAP to take name as input and display name with hello message
import java.util.*;
class jp22 {
	public static void main(String [] args){
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		name=sc.nextLine();
		System.out.println("Hello "+name);
	}
}