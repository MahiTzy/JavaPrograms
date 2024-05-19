//Word Counter
import java.util.*;
class jp25 {
	public static void main(String [] args) {
		String sen;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		sen=sc.nextLine();
		String [] words=sen.split(" ");
		System.out.println("Number of words="+words.length);
	}
}