import java.util.*;

public class jp18 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int large=arr[0];
		int small=arr[0];
		System.out.println("Output : ");
		for(int i=1;i<n;i++)
		{
			if(large<arr[i]){
				large=arr[i];
			}
			else if(small>arr[i]){
				small=arr[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
    }
}