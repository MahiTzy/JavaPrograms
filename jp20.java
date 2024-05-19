import java.util.*;

public class jp20 {
	 public static void main(String[] args) {
		
		
		
		int[] roll = {1,2,3,4,5};
		int[] per = {90,80,70,60,50};
		int search = 3;
		
		for(int i=0;i<5;i++)
		{
			if(search==roll[i])
			{
				System.out.println("Roll No : "+search+"\nPercentage : "+per[i]);
				return;
			}
		}
		System.out.println("Roll no not found !");
    }
}