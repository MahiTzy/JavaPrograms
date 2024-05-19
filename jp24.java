//WAP to compare two strings for equality
import java.util.*;
class jp24 {
	public static void main(String [] args) {
		String str1, str2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string : ");
		str1=sc.nextLine();
		System.out.print("Enter second string : ");
		str2=sc.nextLine();
		if(str1.equalsIgnoreCase(str2)==true){
		System.out.println("Equal");
		}
		else {
		System.out.println("Not Equal");
		}		
	}
}