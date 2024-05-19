import java.util.*;

public class jp19 {
	 public static void main(String[] args) {
		
		
		
		int[] arr1 = {1,22,3,4,5};
		int[] arr2 = {9,8,7,6,5};
		int[] arr3 = new int[10];
		
		int p = 0;
		for(int i=0;i<5;i++)
		{
			arr3[p]=arr1[i];
			p++;
		}
		for(int i=0;i<5;i++)
		{
			arr3[p]=arr2[i];
			p++;
		}

		System.out.println("Merged Array : ");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr3[i]+" ");
		}
    }
}