import java.util.*;

public class jp17 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int[] arr = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Output : ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0){
			System.out.print(arr[i]+" ");
			}
		}
    }
}